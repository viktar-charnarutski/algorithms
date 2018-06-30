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
        System.out.println(stack);
        assertEquals(99, stack.pop());

    }
}