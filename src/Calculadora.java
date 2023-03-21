import java.util.regex.*;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 12/03/2023
 * Sección: 40
 * Clase que contiene el metodo para evaluar una expresión prefix
 */

public class Calculadora{

// Método que evalua una expresión prefix usando un stack y devuelve su resultado
    public static double evaluatePrefix(String expresion) {

        Stack<Double> pila = new Stack<>();
        String[] tokens = expresion.split(" ");
        
        for (int i = tokens.length - 1; i >= 0; i--) {

            String token = tokens[i];

            if (token.matches("-?\\d+(\\.\\d+)?")) {
                
                pila.push(Double.parseDouble(token));

            } else {
                
                double num2 = pila.pull();
                double num1 = pila.pull();
                
                switch (token) {
                    case "+":
                        pila.push(num1 + num2);
                        break;
                    case "-":
                        pila.push(num1 - num2);
                        break;
                    case "*":
                        pila.push(num1 * num2);
                        break;
                    case "/":
                        pila.push(num1 / num2);
                        break;
                    default:
                        throw new IllegalArgumentException("Operador no válido: " + token);
                }
            }
        }
        
        return pila.pull();
    }    
    

}