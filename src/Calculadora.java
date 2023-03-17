import java.util.regex.*;

public class Calculadora{

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