package dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumbersTest {

    @Test
    public void fib1_memoization() {
        assertEquals(1, new FibonacciNumbers().fibMemoization(1));
    }

    @Test
    public void fib2_memoization() {
        assertEquals(1, new FibonacciNumbers().fibMemoization(2));
    }

    @Test
    public void fib3_memoization() {
        assertEquals(2, new FibonacciNumbers().fibMemoization(3));
    }

    @Test
    public void fib7_memoization() {
        assertEquals(13, new FibonacciNumbers().fibMemoization(7));
    }

    @Test
    public void fib13_memoization() {
        assertEquals(233, new FibonacciNumbers().fibMemoization(13));
    }

    @Test
    public void fib1_fibBottomUp() {
        assertEquals(1, new FibonacciNumbers().fibBottomUp(1));
    }

    @Test
    public void fib2_fibBottomUp() {
        assertEquals(1, new FibonacciNumbers().fibBottomUp(2));
    }

    @Test
    public void fib3_fibBottomUp() {
        assertEquals(2, new FibonacciNumbers().fibBottomUp(3));
    }

    @Test
    public void fib7_fibBottomUp() {
        assertEquals(13, new FibonacciNumbers().fibBottomUp(7));
    }

    @Test
    public void fib13_fibBottomUp() {
        assertEquals(233, new FibonacciNumbers().fibBottomUp(13));
    }
}