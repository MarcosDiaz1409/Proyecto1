import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class AsignanteTest {

	Asignante asignante = new Asignante();
	
	@Test
	void testSetqFunction() {
		asignante.setqFunction("x", 5);
        assertEquals(asignante.getValue("x"), 5);
	}

	@Test
	void testGetValue() {
		assertNull(asignante.getValue("x"));
        asignante.setqFunction("x", 5);
        assertEquals(asignante.getValue("x"), 5);
	}

	@Test
	void testAgregarFuncion() {
		String nombre = "suma";
        String parametros = "int a, int b";
        asignante.agregarFuncion(nombre, parametros);
        assertTrue(asignante.verifyFunc(nombre));
	}
	
	@Test
	void testverifyFunc() {
		String nombre = "resta";
        assertFalse(asignante.verifyFunc(nombre));
        asignante.agregarFuncion(nombre, "int a, int b");
        assertTrue(asignante.verifyFunc(nombre));
	}

}
