import java.util.Date;
import java.util.Locale;
/**
 *
 * @author Henk Beula
 */
public class SystemTimeLang {
    public static void main(String[] args) {
        System.out.println(systemTimeLang());
    }

    public static String systemTimeLang(){
        //Date clock = new Date();
        //Locale localLang = Locale.getDefault();
        return "Time: " + new Date().toString() + "  Language: " + Locale.getDefault();
    }
    
}
