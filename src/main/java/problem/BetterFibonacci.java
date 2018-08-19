package problem;

/**
 * Better Fibonacci
 *
 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next number is found by
 * adding up the two numbers before it.
 *
 * Your goal is to write an optimal method - betterFibonacci that returns the nth Fibonacci number in the sequence.
 * n is 0 indexed, which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., n == 0 should return 0 and
 * n == 3 should return 2. Your method should exhibit a runtime complexity of O(n) and use constant O(1) space.
 * With this implementation, your method should be able to compute larger sequences where n > 40.
 */
public class BetterFibonacci {
    public int betterFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int res1 = 2, res2 = 1, r = 3;
        while (r++ < n) {
            int tmp = res1;
            res1 = res1 + res2;
            res2 = tmp;
        }
        return res1;
    }
}
