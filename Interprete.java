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
    Operador operador = new Operador();



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
        }else if(evaluate("^\\(\\d+\\s*[<>]\\s*\\d+\\)$", expresion)){
            return 4;
        }else if(evaluate("^\\((\\w+)\\s*=\\s*(\\w+)\\)$", expresion)){
            return 5;
        }else if(evaluate("^\\(.*atom.*\\)$", expresion)){
            return 6;
        }else if(evaluate("\\((list)\\s+(.*)\\)", expresion)){
            return 7;
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

            case 4:

                String newString = operation.replaceAll("[()]", "");
                String[] partes = newString.split(" ");

                int v1 = Integer.parseInt(partes[0]);
                int v2 = Integer.parseInt(partes[2]);
                String signo = partes[1]; 

                if(signo.equals(">")){
                    System.out.println(operador.Mayor(v1, v2));
                }else if(signo.equals("<")){
                    System.out.println(operador.Menor(v1, v2));
                }
                

            break;

            case 5:

                String newString1 = operation.replaceAll("[()]", " ");
                String[] partes1 = newString1.split("=");

                int num1 = Integer.parseInt(partes1[0].replaceAll("\\D", ""));
                int num2 = Integer.parseInt(partes1[1].replaceAll("\\D", ""));

                System.out.println(operador.isEqualTo(num1, num2));
            
            break;

            case 6:

                Pattern patron = Pattern.compile("^\\((.*?)\\)$");
                Matcher evaluador = patron.matcher(operation);
                if (evaluador.find()){
                    String atomo = evaluador.group(1);
                    Object dato = null;
                    if(atomo.matches("atom\\s+\\(.+\\)")){
                        System.out.println(false);
                        break;
                    }
                    if(atomo.matches("\\d+")) {
                        dato = Integer.parseInt(atomo);
                    } else if(atomo.matches("\\d+\\.\\d+")) {
                        dato = Double.parseDouble(atomo);
                    }else {
                        dato = atomo;
                    }

                    System.out.println(operador.Atom(dato));

                }


            break;

            case 7:

                int index = operation.indexOf("list") + "list".length();  
                String result = operation.substring(index).trim(); 
                String newResult = result.replaceAll("[)]", "");

                String[] lista = newResult.split(" ");
                
                System.out.println(operador.createLista(lista));

            break;

            case -1:
                System.out.println("Error: expresion invalida");
            break;
        
        }
    }

}