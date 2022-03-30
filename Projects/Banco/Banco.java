package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Henk Beula
 */
public class Banco {
    public static void main(String[] args) {
        Conta c1=new Conta();
        c1.setNumConta(487954852);
        c1.setDono(JOptionPane.showInputDialog("Introduza seu nome!"));
        c1.abrirConta(JOptionPane.showInputDialog("Que tipo de conta pretende criar?"
                +"\n"+"Digite CC para (Conta corrente) ou CP para (conta popança)"));
        c1.depositar(Float.parseFloat(JOptionPane.showInputDialog("Introduza o "
                + "valor que pretende depositar:")));
        c1.statusConta();
        System.out.println("\n");
        c1.sacar(Float.parseFloat(JOptionPane.showInputDialog("Introduza o "
                + "valor que pretende sacar:")));
           System.out.print("Saldo atual: "+c1.getSaldo());
    }
    
}
