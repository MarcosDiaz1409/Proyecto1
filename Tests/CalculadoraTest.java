import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calculadora = new Calculadora();
	
	@Test
	void testEvaluatePrefix() {
		
		String input = "+ * 2 3 4";
		double resultado = 10;
		double prueba = calculadora.evaluatePrefix(input);
		assertEquals(prueba, resultado);
		
		String input1 = "+ 2 3";
		double resultado1 = 5;
		double prueba1 = calculadora.evaluatePrefix(input1);
		assertEquals(prueba1, resultado1);
		
		String input2 = "+ * / 3 6 6 4";
		double resultado2 = 16;
		double prueba2 = calculadora.evaluatePrefix(input2);
		assertEquals(prueba2, resultado2);
		
	}

}
