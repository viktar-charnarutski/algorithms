package problem;

/**
 * 813. Largest Sum of Averages
 * <p>
 * We partition a row of numbers A into at most K adjacent (non-empty) groups,
 * then our score is the sum of the average of each group. What is the largest score we can achieve?
 * <p>
 * Note that our partition must use every number in A, and that scores are not necessarily integers.
 */
public class LargestSumOfAverages {
    public double largestSumOfAverages(int[] A, int K) {
        int length = A.length;
        double[][] memo = new double[length + 1][K + 1];
        double sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            memo[i + 1][1] = sum / (i + 1);
        }
        return compute(length, K, A, memo);
    }

    private double compute(int length, int interval, int[] arr, double[][] memo) {
        if (memo[length][interval] > 0) return memo[length][interval];
        if (length < interval) return 0;
        double curr = 0;
        for (int i = length - 1; i >= 0; i--) {
            curr += arr[i];
            memo[length][interval] = Math.max(memo[length][interval],
                    compute(i, interval - 1, arr, memo) + curr / (length - i));
        }
        return memo[length][interval];
    }
}
