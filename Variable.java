import java.util.HashMap;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 28/02/2023
 * Sección: 40
 * Clase que instancia una variable ingresada en el interprete
 */

public class Variable<T>{

    private String nombre;
    private T valor;
    private HashMap<String, Integer> variables;

    /**
     * Parametros de la clase variable
     * @param nombre Almacena el nombre de la variable
     * @param valor Almacena el valor o lo que contiene la variable
     */

    // Constructor de la clase
    public Variable(String nombre, T valor, HashMap<String, Integer> variables){
        this.nombre = nombre;
        this.valor = valor;
        variables = new HashMap<String, Integer>();
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return valor
     */
    public T getValor() {
        return this.valor;
    }

    /**
     * @param valor
     */
    public void setValor(T valor) {
        this.valor = valor;
    }

}