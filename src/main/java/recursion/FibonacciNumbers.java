package recursion;

/**
 * Fibonacci Numbers - a series of numbers in which each number ( Fibonacci number ) is the sum of the
 * two preceding numbers.
 * <p>
 * The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 * <p>
 * The Rule is Xn = Xn-1 + Xn-2
 */
public class FibonacciNumbers {
    public int fib(int n) {
        if (n <= 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
