import java.text.SimpleDateFormat;
import java.util.Date;
public class _Pessoa {
    protected String nome;
    protected String genero;
    protected String dataNascimento;

    public _Pessoa(String nome, String genero, String dataNascimento) {
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
    }

    public _Pessoa(){}
    public String getNome() {
        return nome;
    }

    //metodo acessor setter, para poder inicializar o valor dos atributos desta classe estando noutras classes
    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodo acessor getter, para poder visualizar o valor dos atributos desta classe estando noutras classes
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
