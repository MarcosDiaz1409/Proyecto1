import java.util.HashMap;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 12/03/2023
 * Sección: 40
 * Clase que contiene los metodos para el setq y defun
 */


public class Asignante{

    private HashMap<String, Variable> variables;
    private HashMap<String, Funcion> funciones;

    /**
     * Paremetros de la clase
     * @param variables es un hashmap que contiene el nombre y valor de todas las variables definidas
     */

    /**
     * Constructor de la clase
     */
    public Asignante(){
        variables = new HashMap<String,Variable>();
        funciones = new HashMap<String,Funcion>();
    }

    /**
     * Metodo que almacena una variable definida por el usuario
     */
    public void setqFunction(String nombre, Object valor){
        Variable newVariable = new Variable(nombre, valor);
        variables.put(nombre, newVariable);
    }

    /**
     * Metodo que busca el valor de una variable ingresada por el usuario
     */
    public Object getValue(String nombre){

        if (variables.containsKey(nombre)) {
            Variable variable = variables.get(nombre);
            return variable.getValor();
        } else {
            return null;
        }

    }

    /**
     * Metodo que almacena una funcion definida por el usuario
     */
    public void agregarFuncion(String nombre, String parametros){
        Funcion newFunction = new Funcion(nombre, parametros);
        funciones.put(nombre, newFunction);
    }   

    

}