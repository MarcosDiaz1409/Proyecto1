import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interprete{

    public static int getType(String expresion){

        if (evaluate("^[(][ ]*setq[ ]+[a-z]+[ ]+[0-9]+[ ]*[)]$",expresion)){
            return 1;
        } 
        else{
            return -1;
        }   
        
    }

    private static boolean evaluate(String regex, String expresion) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(expresion);
	    return matcher.find();
	}

}