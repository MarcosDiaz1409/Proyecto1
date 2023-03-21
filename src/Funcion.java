
/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 12/03/2023
 * Sección: 40
 * Clase que instancia una función ingresada en el interprete 
 */

public class Funcion{
    
    private String nombre;
    private String parametros;

    public Funcion(String nombre, String parametros){
        this.nombre = nombre;
        this.parametros = parametros;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParametros() {
        return this.parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }


}