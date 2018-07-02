package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortStackTest {

    @Test
    public void sort() {
        SortStack stack = new SortStack();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        stack.sort();

        assertEquals(3, stack.pop());
        assertEquals(23, stack.pop());
        assertEquals(31, stack.pop());
        assertEquals(34, stack.pop());
        assertEquals(92, stack.pop());
        assertEquals(98, stack.pop());
    }
}