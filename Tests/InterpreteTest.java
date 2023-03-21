import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterpreteTest {
	
	Interprete Interprete = new Interprete();

	@Test
	void testGetType() {
		
		// Case 1
        String expresion1 = "setq x 10";
        int result1 = Interprete.getType(expresion1);
        assertEquals(1, result1);

        // Case 2
        String expresion2 = "a";
        int result2 = Interprete.getType(expresion2);
        assertEquals(2, result2);

        // Case 3
        String expresion3 = "(quote (a b c))";
        int result3 = Interprete.getType(expresion3);
        assertEquals(3, result3);

        // Case 4
        String expresion4 = "(5 < 10)";
        int result4 = Interprete.getType(expresion4);
        assertEquals(4, result4);
        
        String expresion4_1 = "(10 > 5)";
        int result4_1 = Interprete.getType(expresion4_1);
        assertEquals(4, result4_1);

        // Case 5
        String expresion5 = "(5 = 5)";
        int result5 = Interprete.getType(expresion5);
        assertEquals(5, result5);

        // Case 6
        String expresion6 = "(atom 2)";
        int result6 = Interprete.getType(expresion6);
        assertEquals(6, result6);

        // Case 7
        String expresion7 = "(list a b c)";
        int result7 = Interprete.getType(expresion7);
        assertEquals(7, result7);

        // Case 8
        String expresion8 = "(+ (* 2 3) 5)";
        int result8 = Interprete.getType(expresion8);
        assertEquals(8, result8);

        // Case 9
        String expresion9 = "(defun nom (a b) (+ a b))";
        int result9 = Interprete.getType(expresion9);
        assertEquals(9, result9);

        // Default
        String expresion10 = "Hola";
        int result10 = Interprete.getType(expresion10);
        assertEquals(-1, result10);
		
	}

	@Test
	void testOperator() {
		
	
		
	}

}
