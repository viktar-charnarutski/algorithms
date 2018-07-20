package problem;

/**
 * Ways to Cover a Distance
 * <p>
 * Given a distance ‘dist, count total number of ways to cover the distance with 1, 2 and 3 steps.
 */
public class WaysToCoverDistance {
    public int countWaysToCoverDistance(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        Integer[] memo = new Integer[n];
        return countWaysToCoverDistance(n - 1, memo) +
                countWaysToCoverDistance(n - 2, memo) +
                countWaysToCoverDistance(n - 3, memo);
    }

    public int countWaysToCoverDistance(int n, Integer[] memo) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (memo[n] != null) return memo[n];
        memo[n] = countWaysToCoverDistance(n - 1, memo) +
                countWaysToCoverDistance(n - 2, memo) +
                countWaysToCoverDistance(n - 3, memo);
        return memo[n];
    }
}
