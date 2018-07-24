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
    private int sum;

    public int maxValue(int[] vals, int[] weights, int capacity) {
        maxValue(vals, weights, capacity, 0, 0, 0);
        return sum;
    }

    private void maxValue(int[] vals, int[] weights, int capacity, int i, int currCapacity, int currSum) {
        if (currCapacity > capacity) return;
        sum = Math.max(currSum, sum);

        if (i == vals.length) return;
        maxValue(vals, weights, capacity, i + 1, currCapacity + weights[i], currSum + vals[i]);
        maxValue(vals, weights, capacity, i + 1, currCapacity, currSum);
    }
}
