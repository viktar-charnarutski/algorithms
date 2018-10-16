package problem;

/**
 * Non-Divisible Subset
 * <p>
 * Given a set of distinct integers, print the size of a maximal subset of S where the sum of any 2 numbers in S' is not
 * evenly divisible by k.
 */
public class NonDivisibleSubset {
    static int nonDivisibleSubset(int k, int[] S) {
        int[] rems = new int[k + 1];
        for (int value : S) {
            rems[value % k]++;
        }
        int maxLength = 1;
        for (int i = 1; i < rems.length / 2; i++) {
            maxLength += Math.max(rems[i], rems[k - i]);
        }
        return maxLength;
    }
}
