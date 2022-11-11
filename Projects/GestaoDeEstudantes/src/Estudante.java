import java.util.Date;
public class Estudante extends Pessoa{/*Abstraction*/
    private float mark1st; //nota1 do aluno
    private float mark2nd; //nota2 do aluno
    private int id; //codigo do aluno
    private float average; //media do aluno
    private String course; //curso
    private int absence; //faltas

    public Estudante(Date birthday, String gender, float mark1st, float mark2nd, int id, float average, String course, int absence){
        super
        this.course = course;
        this.birthday = birthday;
        this.gender = gender;
        this.mark1st = mark1st;
        this.mark2nd = mark2nd;
        this.id = id;
        this.average = average;
        this.absence = absence;
    }


    public Estudante() {
    }
    
    public void setAbsence(int absence){
        this.absence = absence;
    }

    public int getAbsence(){
        return this.absence;
    }

    public void setMark1st(float mark1st){
        this.mark1st = mark1st;
    }

    public float getMark1st(){
        return this.mark1st;
    }

    public void setMark2nd(float mark2nd){
        this.mark2nd = mark2nd;
    }

    public float getMark2nd(){
        return this.mark2nd;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    /*public void setAverage(float average, int marksCount){//marksCount equals the number of marks to consider
        double temp = 0;
        for(int i =0; i<=marksCount;i++)
            temp+=this.mark
    }*/

    public float getAverage(){
        return this.average;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public String getCourse(){
        return this.course;
    }

    /*@Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", midName='" + getMidName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", gender='" + getGender() + "'"+
            " mark1st='" + getMark1st() + "'" +
            " mark2nd='" + getMark2nd() + "'" +
            ", id='" + getId() + "'" +
            ", average='" + getAverage() + "'" +
            ", course='" + getCourse() + "'" +
            ", absence='" + getAbsence() + "'" +
            "}";
    }*/
}