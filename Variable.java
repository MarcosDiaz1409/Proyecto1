import java.util.HashMap;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 28/02/2023
 * Sección: 40
 * Clase que instancia una variable ingresada en el interprete
 */

public class Variable<T>{

    private String nombre;
    private Object valor;
    private static HashMap<String, Object> variables = new HashMap<String, Object>();

    /**
     * Parametros de la clase variable
     * @param nombre Almacena el nombre de la variable
     * @param valor Almacena el valor o lo que contiene la variable
     */

    // Constructor de la clase
    public Variable(){
        variables = new HashMap<>();
    }

    public void setq(String nombre, Object valor) {
        variables.put(nombre, valor);
    }

    public Object get(String nombre) {
        return variables.get(nombre);
    }

    

}