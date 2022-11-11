import java.util.Scanner;
import java.util.ArrayList;

public class _GestaoDeEstudantes {
    static _Estudante[] estudante = new _Estudante[10000];//Array para guardar os dados dos estudantes
    static String[] aux = new String[10000];//Array para auxiliar na pesquisa dos dados estudantes
    static String[] medias = new String[1667];//Array para guardar as medias dos estudantes
    //ArrayList <Estudante> _estudante = new ArrayList<>();

    public static void main(String [] args){
        menu();
    }

    public static void menu(){
        int escolha;
        boolean pare=true;//variavel para controlar o ciclo, o ciclo para quando troca para "false"
        Scanner cs = new Scanner(System.in);//Uso da classe Scanner para entrada de dados via teclados
        _GestaoDeEstudantes gt = new _GestaoDeEstudantes();//Instacia da classe GestaoDeEstudantes
        do{//Menu que sera mostrado na tela, com opcaoes para o utilizados selecionar
            System.out.println("--------------------------------------------");
            System.out.println("-           Gestao de Pacientes            -");
            System.out.println("-1.Inscrever estudante                     -");
            System.out.println("-2.Media das notas dos estudantes          -");
            System.out.println("-3.Imprimir lista de estudantes            -");
            System.out.println("-4.Pesquisar estudantes                    -");
            System.out.println("-0.Fechar programa                         -");
            System.out.println("--------------------------------------------");
            escolha=cs.nextInt();//Para escolher as diferentes opcoes do menu
            switch(escolha){
                case 1://Inscrever estudante
                    _Estudante dados= new _Estudante();//instancia da classe Estudante
                    for(int i=0;i<estudante.length;i++){
                        System.out.println("Introduza o nome do Estudante: ");
                        dados.setNome(cs.next());//da a opcao de introduzir o nome do estudante via teclado
                        System.out.println("Introduza o genero do Estudante: ");
                        dados.setGenero(cs.next());//da a opcao de introduzir o genero do estudante via teclado
                        System.out.println("Introduza o Codigo: ");
                        dados.setCodigo(cs.nextInt());//da a opcao de introduzir o codigo do estudante via teclado
                        System.out.println("Introduza o Curso: ");
                        dados.setCurso(cs.next()); //da a opcao de introduzir o curso do estudante via teclado
                        System.out.println("Introduza a do Nota 1: ");
                        dados.setNota1(cs.nextFloat());//da a opcao de introduzir a nota1 do estudante via teclado
                        System.out.println("Introduza a Nota 2: ");
                        dados.setNota2(cs.nextFloat());//da a opcao de introduzir a nota2 do estudante via teclado
                        System.out.println("Introduza a Data de nascimento: ");
                        dados.setDataNascimento(cs.next());//da a opcao de introduzir a data de nascimento  do estudante via teclado
                        System.out.println("Pretende registar mais estudantes?");
                        for(int j=0;j<estudante.length;j++) {//ciclo para percorrer o array e guardar os dados dos estudantes
                            if(estudante[j]==null){//Se a posicao nao tiver dados de outro estudante entao ele armazena la os dados do novo estudante
                                aux[j]=dados.getNome();//guarda no array o nome do estudante, que depois sera utilizado para pesquisa
                                //guarda no array os dados do estudante
                                estudante[j] = new _Estudante(dados.getNome(), dados.getGenero(), dados.getDataNascimento(), dados.getCodigo(),dados.getNota1(),dados.getNota2(), dados.getCurso());
                                medias[j] = dados.mediaView();//guarda no arry as medias das notas dos estudantes
                                break;//termina de imediato o ciclo, uma vez armazenados os dados do estudante
                            }

                        }
                        System.out.println("Se sim digite 1 se nao digite 0");
                        //da a opcao de continuar a registar mais Estudantes, ou voltar ao menu principal
                        int continua=cs.nextInt();
                        if(continua==0){
                            break;
                        }
                    }menu();//chama o metodo menu
                    pare=false;
                    break;
                case 2:
                    for(int i=0;i<medias.length;i++){//para mostrar as medias das notas dos Estudantes
                        if(medias[i]!=null)//para imprimir apenas as posicoes que nao estiverem vazias
                            System.out.println(medias[i]);
                    }
                    //Da a opcao de voltar ao menu principal
                    System.out.print("Quer voltar ao menu? Digite 1: ");
                    int volta=cs.nextInt();
                    if(volta==1){
                        menu();
                    }
                    pare=false;
                    break;
                case 3:
                    //Para imprimir a lista dos estudantes
                    for(int i=0;i<estudante.length;i++){
                        if(estudante[i]!=null)//Nao imprime posicoes vazias
                            System.out.println(estudante[i]);
                    }

                    //Da opcao de voltar ao menu principal
                    System.out.print("Quer voltar ao menu? Digite 1: ");
                    int voltar=cs.nextInt();
                    if(voltar==1){
                        menu();
                    }
                    pare=false;
                    break;
                case 0:
                    //Fecha o programa (termina o ciclo)
                    System.out.println("Adeus..");
                    pare=false;
                    break;
                case 4://Da opcao de pesquisar o estudante pelo nome
                    System.out.println("Digite o nome do estudante: ");
                    String nomeE = cs.next();//Da a pocibilidade de introduzir o nome do estudante a ser procurado
                    for(int k=0;k<aux.length;k++){
                        if(aux[k].equals(nomeE)){//compara o nome introduzido com os guardados no array
                            System.out.println(estudante[k]);//uma vez encontrado o nome, imprime os dados
                            //do estudante armazenados no outro array
                            break;//Interrompe o fluxo uma vez encontrado o estudante procurado
                        }
                    }//Da a opcao de voltar ao menu principal
                    System.out.println("Quer voltar ao menu? Digite 1: ");
                    int volt=cs.nextInt();
                    if(volt==1){
                        menu();//chama o metodo menu;
                    }
                    pare=false;
                    break;
                default://Motra esta imformacao caso uma opcao nao presente no menu seja introduzida
                    System.out.println("Opcao invalida! Tente Novamente");
            }
        }while(pare!=false);
    }
}
