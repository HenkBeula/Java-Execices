package banco;
/**
 *
 * @author Henk Beula
 */
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void statusConta(){
        System.out.println("--------------------------------------------");
        System.out.println("Status da conta: "+this.isStatus());
        System.out.println("Numero da conta: "+this.getNumConta());
        System.out.println("Dono da conta: "+this.getDono());
        System.out.println("Tipo de conta: "+this.getTipo());
        System.out.println("Saldo: "+this.getSaldo());
    }
    
    public void abrirConta(String tipo){
        System.out.println("Conta do "+this.getDono()+" aberta com secesso");
        this.setStatus(true);
        this.setTipo(tipo);
        switch (tipo) {
            case "CC":
                this.setSaldo(50);
                break;
            case "CP":
                this.setSaldo(150);
                break;
        }
    }
    
    public void fecharConta(){
        if(this.getSaldo()>0)
            System.out.print("Primeiro retire todo o saldo da conta");
        else if(this.getSaldo()<0)
            System.out.print("Pague a divida");
        else
            this.setStatus(false);
            System.out.print("Conta encerada");
    }
    
    public void depositar(float valor){
        if (this.isStatus()==true){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Deposito realizado com sucesso na conta de "+this.getDono());
        }
        else
            System.out.print("Erro!verifique o numero da conta"+"\n"+"Ou contacte o fornecedor do serviço");
    }
    
    public void sacar(float valor){
        if(this.isStatus()==true){
            if(this.getSaldo()>valor){
               this.setSaldo(this.getSaldo()-valor);
               System.out.println("Saque realizado com sucesso na conta de "+this.getDono());
            }
            else if(this.getSaldo()<valor)
                System.out.print("Erro! Saldo insuficiente");
        }
        else
            System.out.print("Erro!verifique o numero da conta"+"\n"+"Ou contacte o fornecedor do serviço");
                
    }
    
    public void PagarMensalidade(float taxa){
        switch (this.getTipo()) {
            case "CC":
                taxa=15;
                break;
            case "CP":
                taxa=25;
                break;
        }
            
        if(this.isStatus()==true){
            if(this.getSaldo()>=taxa){
                this.setSaldo(this.getSaldo()-taxa);
                System.out.print("Pagamento efetuado com sucesso");
            }
            else if (this.getSaldo()<taxa)
                System.out.print("Erro! Saldo insuficiente");
        }
        else
            System.out.print("Erro! Operacao invalida, conta inativa.");
    }

    public Conta() {
        this.status= false;
        this.saldo =0 ;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
