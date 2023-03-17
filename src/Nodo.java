/**
 * @author Marcos Diaz y Daniel Machic
 * @Date: 27/02/2023
 * Sección: 40
 * Clase que instancia un nodo para stack
 */

public class Nodo<T>{

    private T value;
	private Nodo<T> next;
	
	public Nodo(T value) {
		this.setValue(value);
	}
    
	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * @return the next
	 */
	public Nodo<T> getNext() {
		return next;
	}
    
	/**
	 * @param next the next to set
	 */
	public void setNext(Nodo<T> next) {
		this.next = next;
	}

}