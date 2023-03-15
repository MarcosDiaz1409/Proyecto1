/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 11/03/2023
 * Sección: 40
 * Clase principal donde el usuario interactua con el programa
*/

public class Operador{

    public boolean Mayor(int v1, int v2){
        
        boolean res;
        if(v1 > v2){
            res = true;
        }else{
            res = false;
        }
        return res;

    }

    public boolean Menor(int v1, int v2){
        
        boolean res;
        if(v1 < v2){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    public boolean isEqualTo(int v1, int v2){

        boolean res;
        if(v1 == v2){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
    
    public boolean Atom(Object objeto){

        if(objeto instanceof Integer || objeto instanceof Double || objeto instanceof Character || objeto instanceof String || objeto == null) {
            return true;
        }else{
            return false;
        }

    }

    public List<Object> createLista(String[] string){
        
        List<Object> lista = new ArrayList<>();
        Object partesLista;
        for(String elemento : string){

            if(elemento.matches("\\d+")){
                partesLista = Integer.parseInt(elemento);
                lista.add(partesLista);
            }else if(elemento.matches("\\d+\\.\\d+")){
                partesLista = Double.parseDouble(elemento);
                lista.add(partesLista);
            }else if(elemento.equals("true") || elemento.equals("false")){
                partesLista = Boolean.parseBoolean(elemento);
                lista.add(partesLista);
            }else{
                lista.add(elemento);
            }
        }
        
        return lista;
    }
}