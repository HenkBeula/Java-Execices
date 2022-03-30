import javax.swing.JOptionPane;
/**@author Henk Beula*/
public class ErastosteneS_Crivo {
    public static void main(String[] args) {
        int N=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        int raiz= (int) Math.sqrt(N);
        boolean Array[]=new boolean[N];
        System.out.print("Crivo de Erastostenes"+"\n");
        System.out.print("--For an array of length "+N+"\n"+"--The primes are:");
        /*Percore o array e inicializa todas
        as posicoes com o valor true*/
        for(int i=2;i<Array.length;i++){
            Array[i]=true;
        }
        /*Percore o array e inicializa todas as posicoes
        multiplas de numeros primos como falso*/
        for(int i=2;i<=raiz;i++){
            if(Array[i]==true)
               for(int j=i+i;j<Array.length;j+=i)
                   Array[j]=false;
        }
        /*percorre o array e imprime apenas os indices
        com valor true*/
        for(int i=2;i<Array.length;i++){
            if(Array[i]==true){
            System.out.print(i+", ");}
        } 
    }
    
}
