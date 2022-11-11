public class _Estudante extends _Pessoa {//Esta classe herda atributos da classe pessoa
    //Atribudos do estudante
    private float nota1;
    private float nota2;
    private int codigo;
    private String curso;

    //Contrutor da classe Estudante, invocado ao instanciar esta classe
    public _Estudante(String nome, String genero, String dataNascimento, int codigo,float nota1,float nota2, String curso) {
        super(nome, genero, dataNascimento);
        this.nome=nome;
        this.genero=genero;
        this.dataNascimento=dataNascimento;
        this.codigo=codigo;
        this.curso=curso;
        this.nota1=nota1;
        this.nota2=nota2;
    } //

    //methodo contrutor vazio, invocado a instanciar esta classe
    public _Estudante(){}

    //Metodo para calcular e retornar o valor da media das notas do estudante
    public float media(){
        float media;
        return media=(this.nota1+this.nota2)/2;
    }

    //metodo acessor getter, para poder visualizar o valor dos atributos desta classe estando noutras classes
    public float getNota1() {
        return nota1;
    }

    //metodo acessor setter, para poder inicializar o valor dos atributos desta classe estando noutras classes
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String mediaView(){
        return "Estudante{" +
                "Nome=" + getNome() +
                ", Media='" + media()+
                '}';
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome=" + getNome() +
                ", curso='" + getCurso() +
                ", codigo=" + getCodigo() +
                ", nota1='" + getNota1() + '\'' +
                ", nota2=" + getNota2() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                '}';
    }
}
