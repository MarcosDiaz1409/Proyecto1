import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interprete{

    public static int getType(String expresion){

        if (evaluate("^[ ]*setq[ ]+[a-z]+[ ]+[0-9]+[ ]*$",expresion)){
            return 1;
        }else if(evaluate("^[ ]*+[a-z]?$",expresion)){
            return 2;
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

    public void Operator(int estado, String operation){
        switch (estado) {
            case 1:

                String[] elementos = operation.split(" ");  
                String name = elementos[1];
                Object value = elementos[2];

                Variable variable = new Variable();
                variable.setq(name, value);  
                
                System.out.println("La variable " + name + " tiene un valor de " + value);
            
            break;

            case 2:

                Variable variable1 = new Variable();
                String[] partes = operation.split(" ");
                String nombre = partes[0];
                System.out.println(variable1.get(nombre));  

            break;

            case -1:
                System.out.println("Error: expresion invalida");
            break;
        
            default:
                System.out.println("Error: expresion invalida");
            break;

        }
    }

}