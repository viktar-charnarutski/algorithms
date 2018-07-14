package problem;

import java.util.Arrays;

/**
 * Triple Step
 * <p>
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
 * steps at a time. Implement a method to count how many possible ways the child can run up the
 * stairs.
 */
public class TripleStep {

    public int tripleStep(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return count(n, memo);
    }

    private int count(int n, int[] memo) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (memo[n] != -1) {
            System.out.println(memo[n]);
            return memo[n];
        }
        memo[n] = count(n - 1, memo) + count(n - 2, memo) + count(n - 3, memo);
        return memo[n];
    }
}
