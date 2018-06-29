package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackMinTest {

    @Test
    public void stack() {
        StackMin stack = new StackMin();
        stack.push(6);
        stack.push(5);
        stack.push(7);
        stack.push(8);
        stack.push(10);
        stack.push(3);
        assertEquals(3, stack.getMin());
        stack.pop();
        assertEquals(5, stack.getMin());

    }
}