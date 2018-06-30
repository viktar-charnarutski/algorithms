package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackOfPlatesTest {

    @Test
    public void push() {
        StackOfPlates stack = new StackOfPlates(5);
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
        assertEquals(99, stack.pop());
    }

    @Test
    public void popAt() {
        StackOfPlates stack = new StackOfPlates(5);
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals(9, stack.popAt(2));
    }
}