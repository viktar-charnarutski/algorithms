package recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumbersTest {

    @Test
    public void fib1() {
        assertEquals(1, new FibonacciNumbers().fib(1));
    }

    @Test
    public void fib2() {
        assertEquals(1, new FibonacciNumbers().fib(2));
    }

    @Test
    public void fib3() {
        assertEquals(2, new FibonacciNumbers().fib(3));
    }

    @Test
    public void fib7() {
        assertEquals(13, new FibonacciNumbers().fib(7));
    }

    @Test
    public void fib13() {
        assertEquals(233, new FibonacciNumbers().fib(13));
    }
}