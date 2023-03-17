
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