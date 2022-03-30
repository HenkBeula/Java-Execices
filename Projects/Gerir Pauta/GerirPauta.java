/*This is a basic program.
I didn't use error handling, so it's normal to come across unhandled errors
Still working on it
Inproving day after day*/
/**
 * @HenkBeula
 */
import java.util.Scanner;
import java.util.ArrayList;
public class GerirPauta{
    static ArrayList<Estudante> Estudantes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        menu();//O menu principal do programa e invocado
        //Mozambique flag
        System.out.print(
        "\n*****************************\n"
        +"* *                         *\n"
        +"*     * *********************\n"
        +"*        *                  *\n"
        +"*     * *********************\n"
        +"* *                         *\n"
        +"*****************************\n");
        System.out.print("\n"+
        "*****"+"   *****"+"   *****"+"   *****\n"+
        "    *****"+"   *****"+"   *****");
    }

    public static void lerDados(){
        Estudante ler = new Estudante();
        byte cont;
        //Registrar os estudantes
            do{
                System.out.println("Digite o numero do aluno:");
                ler.setnum(sc.nextShort());
                System.out.println("Digite o nome do aluno:");
                ler.setNome(sc.next());

                Estudantes.add(new Estudante(ler.getnum(), ler.getNome(), 0, 0,0, 0, null));
                System.out.println("\n"+"**********************");
                System.out.println("*1.Continuar         *\n"+
                                   "*2.Sair              *");
                System.out.println("**********************");
                cont = sc.nextByte();
            }while(cont!=2);
        menu(); 
    }

    public static void menu(){
        int stop=1;
            do{
                System.out.println("\n            Gestao de Estudantes               ");
                System.out.println("*************************************************");
                System.out.println("*1. Registar estudantes                         *");
                System.out.println("*2. Imprimir lista de inscritos                 *");
                System.out.println("*3. Registar resultados de testes               *");
                System.out.println("*4. Imprimir Pauta                              *");
                System.out.println("*5. Sair                                        *");
                System.out.println("*************************************************");
                System.out.println("Escolha uma opcao");
                short entrada = sc.nextShort();

                switch (entrada) {
                    case 1 -> {
                        //some method
                        lerDados();
                        stop = 0;//assim que o metodo associado e invocado, este metodo (menu()) termina.
                    }
                    case 2 -> {
                        //some method
                        imprimirInscritos();
                        menu();//Apos mostrar os alunos inscritos, volta para o menu principal do programa
                        stop = 0;
                    }
                    case 3 -> {
                        //some method
                        menu2();
                        stop = 0;
                    }
                    case 4 -> {
                        //some method
                        imprimirPauta();
                        menu();
                        stop = 0;
                    }
                    case 5 -> {
                        stop = 0;
                        System.out.print("Ate breve..");
                    }
                    default -> System.out.print("Opcao inexistente! \n tente novamente");// caso uma opcao enexistente no menu seja introduzida
                }
            }while(stop!=0);
    }

    public static void menu2(){//Menu de registro de notas e calculo de medias
        int stop=1;
            do{
                System.out.println("\n       Gestao de Estudantes       ");
                System.out.println("************************************");
                System.out.println("*1. Registar teste 1               *");
                System.out.println("*2. Registar teste 2               *");
                System.out.println("*3. Registar nota do exame         *");
                System.out.println("*4. Calcular medias                *");
                System.out.println("*5. Voltar                         *");
                System.out.println("************************************");
                System.out.println("Escolha uma opcao");
                short entrada = sc.nextShort();

                switch (entrada) {
                    case 1, 2, 3 -> {
                        //some method
                        registaNota(entrada);
                        stop = 0;
                    }
                    case 4 -> {
                        //some method
                        calculaMedias();
                        stop = 0;
                    }
                    case 5 -> {
                        //some method
                        menu();
                        stop = 0;
                    }
                    default -> System.out.print("Opcao inexistente! \n tente novamente");
                }
            }while(stop!=0);
    }

    public static void imprimirInscritos(){// imprime o numero e nome de todos os estudantes inscritos
        for(Estudante t: Estudantes){
            System.out.print("Numero: "+t.getnum() + "  " + "Nome: " +t.getNome());
            System.out.print("\n");
        }
    }

    public static void registaNota(int test){
        System.out.println("Digite o codigo do aluno:");
        short num = sc.nextShort();
        boolean encontrado=false;

        for(Estudante t: Estudantes){
            if(test==1){
                if(t.getnum()==num){//se o numero introduzido for igual ao de algum aluno..
                    System.out.print("Digite a nota do primeiro teste do "+ t.getNome()+" :");
                    t.setNota1(sc.nextFloat());
                    encontrado=true;//confirma que foi encontrado
                    break;//e para toda a operacao
                }
            }
            else if(test==2){
                if(t.getnum()==num){
                    System.out.print("Digite a nota do segundo teste do "+ t.getNome()+" :");
                    t.setNota2(sc.nextFloat());        
                    encontrado=true;
                    break;
                }
            }
            else if(test==3){
                if(t.getnum()==num){
                    System.out.print("Digite a nota de exame do "+ t.getNome()+" :");
                    t.setNotaExame(sc.nextFloat());         
                    encontrado=true;
                    break;
                }
            }
                        
        }
        if(!encontrado)
            System.out.println("Aluno com codigo "+num+" nao existe.");
        menu2();
    }

    //Calcula a media de todos os alunos
    public static void calculaMedias(){
        for(Estudante est: Estudantes){
                est.setMedia(est.getNota1(),est.getNota2(), est.getNotaExame());
                if(est.getMedia()<10)
                    est.setobs("Reprovado");
                else
                    est.setobs("Aprovado");
        }
        menu2();
    }

    //Imprime todos os dados dos estudantes
    public static void imprimirPauta(){
        for(Estudante t: Estudantes) {
            System.out.print(t);
            System.out.print("\n");
        }
    }
}