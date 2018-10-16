package problem;

/**
 * Non-Divisible Subset
 * <p>
 * Given a set of distinct integers, print the size of a maximal subset of S where the sum of any 2 numbers in S' is not
 * evenly divisible by k.
 */
public class NonDivisibleSubset {
    static int nonDivisibleSubset(int k, int[] S) {
        int[] rems = new int[k];
        for (int value : S) {
            rems[value % k]++;
        }

        // Handle edge-cases:
        // 1. if there are several numbers dividable by k (remain is 0), we can take only one of them.
        int maxLength = rems[0] > 0 ? 1 : 0;
        // 2. if k-number is even, we can take only one number with k / 2 as a remain.
        maxLength += k % 2 == 0 && rems[k / 2] > 0 ? 1 : 0;

        // Iterate only the first half of the rems array.
        int n = k % 2 == 0 ? k / 2 : k / 2 + 1;
        for (int i = 1; i < n; i++) {
            maxLength += Math.max(rems[i], rems[k - i]);
        }

        return maxLength;
    }
}
