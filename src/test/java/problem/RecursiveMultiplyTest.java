package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursiveMultiplyTest {

    @Test
    public void multiply1() {
        assertEquals(0, new RecursiveMultiply().multiply(12, 0));
    }

    @Test
    public void multiply2() {
        assertEquals(0, new RecursiveMultiply().multiply(0, 12));
    }

    @Test
    public void multiply3() {
        assertEquals(12, new RecursiveMultiply().multiply(1, 12));
    }

    @Test
    public void multiply4() {
        assertEquals(12, new RecursiveMultiply().multiply(12, 1));
    }

    @Test
    public void multiply5() {
        assertEquals(12, new RecursiveMultiply().multiply(4, 3));
    }

    @Test
    public void multiply6() {
        assertEquals(-12, new RecursiveMultiply().multiply(4, -3));
    }
}