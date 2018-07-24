package problem;

/**
 * Knapsack Problem
 * <p>
 * Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value
 * in the knapsack.
 * <p>
 * In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated
 * with n items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value
 * subset of val[] such that sum of the weights of this subset is smaller than or equal to W.
 * You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).
 */
public class KnapsackProblem {

    public int maxValue(int values[], int weights[], int capacity) {
        int dp[][] = new int[values.length + 1][capacity + 1];
        for (int val = 1; val <= values.length; val++) {
            for (int weight = 1; weight <= capacity; weight++) {
                if (weights[val - 1] <= weight) {
                    dp[val][weight] = Math.max(values[val - 1] + dp[val - 1][weight - weights[val - 1]], dp[val - 1][weight]);
                } else {
                    dp[val][weight] = dp[val - 1][weight];
                }
            }
        }
        return dp[values.length][capacity];
    }
}
