import java.util.Date;
/*
 * @Autor Henk Beula
 */

public class Pessoa {
    protected String fullName;
    protected Date birthday;
    protected String gender;

    /**
     * Special constructure, getter and setter methods
    **/

    public Pessoa(String fullName, Date birthday, String gender){
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Pessoa(){}

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    /*public String getFirstName(){

    }

    public String getMidName(){

    }

    public String getLastName(){

    }*/

    public Date getBirthday(){
        return this.birthday;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }



    /*@Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", midName='" + getMidName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", gender='" + getGender() + "'" +
            "}";
    }*/
    
}
