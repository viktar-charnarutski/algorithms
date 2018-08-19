package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BetterFibonacciTest {

    @Test
    public void betterFibonacci1() {
        assertEquals(0, new BetterFibonacci().betterFibonacci(0));
    }
}