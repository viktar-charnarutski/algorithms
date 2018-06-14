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
    public int fibBottomUp(int n) {
        int[] fibs = new int[n + 1];
        for (int i = 0; i < fibs.length; i++) {
            if (i <= 2) {
                fibs[i] = 1;
            } else {
                fibs[i] = fibs[i - 1] + fibs[i - 2];
            }
        }
        return fibs[n];
    }

    public int fibMemoization(int n) {
        return fibMemoization(n, new int[n]);
    }

    private int fibMemoization(int n, int[] memo) {
        if (n <= 2) return 1;
        if (memo[n - 1] == 0) {
            memo[n - 1] = fibMemoization(n - 1, memo) + fibMemoization(n - 2, memo);
        }
        return memo[n - 1];
    }
}