package leetcode.easy;

/**
 * 70. Climbing Stairs
 * <p>
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climbStairs(n, 0, memo);
    }

    private int climbStairs(int n, int i, int[] memo) {
        if (i > n) return 0;
        if (i == n) return 1;

        if (memo[i] > 0) return memo[i];

        memo[i] = climbStairs(n, i + 1, memo) + climbStairs(n, i + 2, memo);

        return memo[i];
    }
}
