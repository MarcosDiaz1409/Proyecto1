import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 01/02/2023
 * Sección: 40
 * Clase principal donde el usuario interactua con el programa
*/

public class Principal{

    public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);
    String operation = "";

    System.out.println(" ..:: Bienvenido al interprete LISP ::.. ");
    System.out.println(" Ingresa una operacion o escribe exit para salir ");
    System.out.println(" Escribe tu operacion: ");
    
    do {
        operation = teclado.nextLine();
        
        if (!operation.equals("exit")) {

            
        }
        
    }while (!operation.equals("exit"));
    
    
    }

}