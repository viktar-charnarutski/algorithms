package leetcode;

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
        int cost1 = 0;
        int cost2 = 0;

        for (int i = cost.length - 1; i <= 0; i--) {
            int costCur = cost[i] + Math.min(cost1, cost2);
            cost2 = cost1;
            cost1 = costCur;
        }

        return Math.min(cost1, cost2);
    }
}
