/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 28/02/2023
 * Sección: 40
 * Clase que instancia una variable ingresada en el interprete
 */

public class Variable{

    private String nombre;
    private Object valor;

    /**
     * Parametros de la clase variable
     * @param nombre Almacena el nombre de la variable
     * @param valor Almacena el valor o lo que contiene la variable
     */

    // Constructor de la clase
    public Variable(String nombre, Object valor){
        this.valor = valor;
        this.nombre = nombre;
    }

    /**
     * @return String
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
     * @return Object
     */
    public Object getValor() {
        return this.valor;
    }

    /**
     * @param valor
     */
    public void setValor(Object valor) {
        this.valor = valor;
    }

}