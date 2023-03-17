import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void testStack() {
		
		Stack<String> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Double> stack3 = new Stack<>();

        assertTrue(stack1.isEmpty());
        assertTrue(stack2.isEmpty());
        assertTrue(stack3.isEmpty());
        
        stack1.push("Palabra");
        stack2.push(0);
        stack3.push(1.290);
        stack1.push("Palabra 2");
        stack2.push(1);
        stack3.push(2.71);
        
        assertEquals("Palabra 2", stack1.peek());
        assertEquals(Integer.valueOf(1), stack2.peek());
        assertEquals(Double.valueOf(2.71), stack3.peek());

        assertEquals("Palabra 2", stack1.pop());
        assertEquals(Integer.valueOf(1), stack2.pop());
        assertEquals(Double.valueOf(2.71), stack3.pop());
        
        assertEquals("Palabra", stack1.peek());
        assertEquals(Integer.valueOf(0), stack2.peek());
        assertEquals(Double.valueOf(1.290), stack3.peek());

        assertEquals("Palabra", stack1.pop());
        assertEquals(Integer.valueOf(0), stack2.pop());
        assertEquals(Double.valueOf(1.290), stack3.pop());

        assertTrue(stack1.isEmpty());
        assertTrue(stack2.isEmpty());
        assertTrue(stack3.isEmpty());
        
	}

}
