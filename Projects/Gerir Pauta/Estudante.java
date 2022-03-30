import java.io.Serializable;
public class Estudante implements Serializable{
    private short num;
    private String nome;
    private float nota1;
    private float nota2;
    private float notaExame;
    private double media;
    private String obs;

    public Estudante(short num, String nome, float nota1, float nota2, float notaExame, double media, String obs) {
        this.num = num;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaExame = notaExame;
        this.media = media;
        this.obs = obs;
    }

    public Estudante(){}

    public float getNotaExame() {
        return notaExame;
    }
    public void setNotaExame(float notaExame) {
        this.notaExame = notaExame;
    }
    public short getnum() {
        return this.num;
    }
    public void setnum(short num) {
        this.num = num;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getobs() {
        return this.obs;
    }
    public void setobs(String obs) {
        this.obs = obs;
    }
    public float getNota1() {
        return this.nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return this.nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public double getMedia() {
        return this.media;
    }
    public void setMedia(float nota1, float nota2, float notaExame) {
        double media;
        media=(nota1+nota2)/2;
        if(media <9.5 || this.nota1<10 || this.nota2<10)
            media=(nota1+nota2+notaExame)/3;
        this.media = media;
    }

    @Override
    public String toString(){
        return "Student{" + "Numero = " + getnum() + "; Nome = " + getNome() + "; Nota1 =" + getNota1() + "; Nota2 =" + getNota2() + "; Exame =" + getNotaExame() + "; Media =" + getMedia() + "; Obs =" + getobs() + "}";
    }

}