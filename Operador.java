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
    
}