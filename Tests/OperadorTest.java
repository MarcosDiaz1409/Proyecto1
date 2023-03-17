import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class OperadorTest {
	
	Operador operador = new Operador();

	@Test
	void testMayor() {
		
		assertTrue(operador.Mayor(5, 2));
        assertFalse(operador.Mayor(3, 5));
        assertFalse(operador.Mayor(1, 1));
		
	}

	@Test
	void testMenor() {
		
		assertTrue(operador.Menor(1, 10));
        assertFalse(operador.Menor(10, 1));
        assertFalse(operador.Menor(2, 2));
		
	}

	@Test
	void testIsEqualTo() {
		
		assertFalse(operador.isEqualTo(1, 5));
        assertFalse(operador.isEqualTo(5, 1));
        assertTrue(operador.isEqualTo(4, 4));
		
	}

	@Test
	void testAtom() {
		
		assertTrue(operador.Atom(1));
        assertTrue(operador.Atom(3.14));
        assertTrue(operador.Atom('w'));
        assertTrue(operador.Atom("Hola"));
        assertTrue(operador.Atom(null));
        assertFalse(operador.Atom(Arrays.asList("elemento1", "elemento2", "elemento3")));
        
    }
		

	@Test
	void testCreateLista() {
		
		String[] lista = {"1", "2.5", "true", "texto", "hola", "1000"};
        List<Object> nuevaLista = new ArrayList<>();
        nuevaLista.add(1);
        nuevaLista.add(2.5);
        nuevaLista.add(true);
        nuevaLista.add("texto");
        nuevaLista.add("hola");
        nuevaLista.add(1000);
        List<Object> listaFinal = operador.createLista(lista);
        assertEquals(nuevaLista, listaFinal);
		
		
	}

}
