import java.util.Scanner;

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

    System.out.println("\n ..:: Bienvenido al interprete LISP ::.. ");
    System.out.println("\n MANUAL DEL USUARIO \n");
    System.out.println("1. La calculadora solo opera números de 0-9 para las operaciones aritméticas.");
    System.out.println("2. La división si se requiere un número entero primero ingresar el número menor y luego el mayor. Si se ingresa al revés, muestra un número decimal. No ingresar división por cero.");
    System.out.println("3. A excepción de la función setq, todas las demás van entre paréntesis. Seguir la siguiente sintaxis: (atom w), (list 1 2 3), (5 = 5), (5 < 4), (5 > 5), (quote (atom w)).");
    System.out.println("4. La sintaxis de setq es: setq a 2. El de las operaciones aritméticas es (* 5 3), (* (+ 5 2) 4) o (+ (* 5 4) (+ 2 3)). ");
    System.out.println("5. La función defun solo almacena la función, no la evalua. Ejemplo: (defun nombre parametros)");
    System.out.println("6. La función list puede almacenar cualquier tipo de dato.");
    System.out.println("7. Las operaciones mayor, menor e igual funcionan solo con enteros");

    Interprete interpreter = new Interprete();
    
    do {

        System.out.println("\n Ingresa una operacion o escribe exit para salir: \n");
        operation = teclado.nextLine();
        
        if (!operation.equals("exit")) {

            int estado = interpreter.getType(operation);
            interpreter.Operator(estado, operation);
            
        }
        
    }while (!operation.equals("exit"));
    
    
    }

}