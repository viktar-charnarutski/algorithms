package problem;

/**
 * 746. Min Cost Climbing Stairs
 *
 * On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
 *
 * Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of
 * the floor, and you can either start from the step with index 0, or the step with index 1.
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int prev = 0;
        int preprev = 0;

        for (int curr : cost) {
            int tmp = prev;
            prev = curr + Math.min(prev, preprev);
            preprev = tmp;
        }

        return Math.min(prev, preprev);
    }
}
