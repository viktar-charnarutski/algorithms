package dp;

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
        return fib(n, new int[n]);
    }

    private int fib(int n, int[] memo) {
        if (n <= 2) return 1;
        if (memo[n - 1] == 0) {
            memo[n - 1] = fib(n - 1, memo) + fib(n - 2, memo);
        }
        return memo[n - 1];
    }
}