/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 27/01/2023
 * Sección: 40
 * Clase que instancia y crea un stack para almacenar numeros
 */

public class Stack<T> implements IStack<T>{

    private Nodo<T> top;
	int count;
	
	// Instancia el stack
	public Stack() {
		top = null;
		count = 0;
	}
	
	// Metodo que recuenta la cantidad de elementos que hay en el stack
	@Override
	public int count() {
		return count;
	}


	// Metodo que verifica si el stack esta vacio
	@Override
	public boolean isEmpty() {
		return count() == 0;
	}

	// Metodo que introduce un elemento al stack
	@Override
	public void push(T value) {
		Nodo<T> newNode = new Nodo<T>(value);
		
		if (isEmpty()) {
			top = newNode;
		} else {
			newNode.setNext(top);
			top = newNode;
		}
		
		count++;
	}

	// Metodo que extare un elemento del stack
	@Override
	public T pull() {
		
		if (isEmpty()) {
			return null;
		} else {
			Nodo<T> temp = top;
			top = top.getNext();
			count--;
			
			return temp.getValue();
		}
		
	}

	// Metodo que extrae el primer valor de la pila (hasta arriba de la pila)
	@Override
	public T peek() {
		
		if (isEmpty()) {
			return null;
		} else {
			return top.getValue();
		}
		
	}

}