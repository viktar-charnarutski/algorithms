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
}