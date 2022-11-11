import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
public class app {
    static ArrayList<Estudante> estudante_ = new ArrayList<>();
    public static void main(String args[]){
        /*int option = 1;
        Scanner sc = new Scanner(System.in);
        do{//menu
            menu();
            option = sc.nextInt();
        }while(option!=0);
        sc.close();*/
        //System.out.println(estudante);
        //registoAcademico();
        
        /*for (Estudante list : estudante_) {
            System.out.println(list);
        }
        registoAcademico();*/
    }

    public static void registoAcademico(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Primeiro nome: ");
            String firstName = sc.next();
            System.out.println("Nome do meio: ");
            String midName = sc.next();
            System.out.println("Ultimo Nome: ");
            String lastName = sc.next();
            System.out.println("Data de nascimento: ");
            Date birthday = null;
            System.out.println("Genero: ");
            String gender = sc.next();
            System.out.println("ID:");//vamos arranjar maneira de gerar automaticamente mais tarde
            int id = sc.nextInt();
            System.out.println("Curso");
            String course = sc.next();

            estudante_.add(new Estudante(firstName, midName, lastName, birthday, gender, 0, 0, id, 0, course,0));
        }catch(Exception e){
            System.out.println("Ocorreu um erro! "+e);
        }finally{
            //sc.close();
        }
    }

    public static void menu(){
        System.out.println("-------------------------------------------\n"+
            "-           Gestao de Pacientes           -\n"+
            "                                          -\n"+
            "1.Registo Academico                       -\n"+
            "2.Procurar estudantes                     -\n"+
            "3.Imprimir lista de estudantes            -\n"+
            "3.Notas                                   -\n"+
            "4.Faltas                                  -\n"+
            "0.Fechar programa                         -\n"+
            "                                          -\n"+
            "Escolha uma opcao                         -\n"+
            "-------------------------------------------"
        );
    }
}
