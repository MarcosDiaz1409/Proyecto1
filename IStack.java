/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 27/02/2023
 * Sección: 40
 * Interface con todos los metodos que el stack utilizara
 */

public interface IStack<T>{

    /**
     * Metodo para contar cuantos elementos hay en el stack
     */
    int count();
    // post: devuelve el numero de elementos en la pila

    /**
     * Metodo para verificar si el stack esta vacio
     */
    boolean isEmpty();
    // post: devuelve un valor 0 si y solo si la pila esta vacia

    /**
     * Metodo para introducir un valor al stack
     */
    void push(T value);
    // post: el valor indicado ingresa a la pila

    /**
     * Metodo para extraer un valor del stack
     */
    T pull();
    // pre: la pila no esta vacia
    // post: el ultimo valor ingresado es extraido

    /**
     * Metodo para observar el ultimo valor ingresado
     */
    T peek();
    // pre: la pila no esta vacia
    // post: el primer valor encontrado es extraido (hasta arriba de la pila)

}
