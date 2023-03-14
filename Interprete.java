import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 02/03/2023
 * Sección: 40
 * Clase donde el interprete hace todas las funciones dependendiendo de lo que el usuario haya ingresado
*/

public class Interprete{

    Asignante asignante = new Asignante();

    /**
     * Metodo que evalua el string ingresado y devuelve un valor dependiendo de la sintaxis
     * @param expresion
     * @return int
     */
    public static int getType(String expresion){

        if (evaluate("^[ ]*setq[ ]+[[a-zA-Z]]+[ ]+.++[ ]*$",expresion)){
            return 1;
        }else if(evaluate("^[ ]*+[a-z]?$",expresion)){
            return 2;
        }else if(evaluate("^\\(quote\\s*\\(.*\\)\\)$", expresion)){
            return 3;
        }
        else{
            return -1;
        }   
        
    }

    /**
     * Metodo que hace la comparacion del string
     * @param regex
     * @param expresion
     * @return boolean
     */
    private static boolean evaluate(String regex, String expresion) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(expresion);
	    return matcher.find();
	}

    /**
     * Metodo que hace el procedimiento correspondiente dependiendo de la sintaxis ingresada
     * @param estado
     * @param operation
     */
    public void Operator(int estado, String operation){
        switch (estado){

            case 1:

                String[] elementos = operation.split(" ");  
                String name = elementos[1];
                String value = elementos[2];

                System.out.println(name);
                System.out.println(value);

                Object valor = null;
                try {
                    valor = Double.parseDouble(value);
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    valor = value;
                }

                asignante.setqFunction(name, valor);
                System.out.println("La variable ha sido guardada con el valor de: " + value);
            
            break;

            case 2:

                String nomVar = operation;
                Object valorN = asignante.getValue(nomVar);
                if(valorN != null){
                    System.out.println(valorN);
                }
                else{
                    System.out.println("La variable no existe");
                }

            break;

            case 3:

                String newOperation = operation.replaceAll("quote", "");
                System.out.println(newOperation);

            break;

            case -1:
                System.out.println("Error: expresion invalida");
            break;
        
        }
    }

}