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
        return countWaysToCoverDistance(n - 1) +
                countWaysToCoverDistance(n - 2) +
                countWaysToCoverDistance(n - 3);
    }
}
