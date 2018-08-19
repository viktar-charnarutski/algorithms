package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BetterFibonacciTest {

    @Test
    public void betterFibonacci_0() {
        assertEquals(0, new BetterFibonacci().betterFibonacci(0));
    }

    @Test
    public void betterFibonacci_1() {
        assertEquals(1, new BetterFibonacci().betterFibonacci(1));
    }

    @Test
    public void betterFibonacci_2() {
        assertEquals(1, new BetterFibonacci().betterFibonacci(2));
    }

    @Test
    public void betterFibonacci_3() {
        assertEquals(2, new BetterFibonacci().betterFibonacci(3));
    }

    @Test
    public void betterFibonacci_35() {
        assertEquals(9227465, new BetterFibonacci().betterFibonacci(35));
    }
}