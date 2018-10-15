package problem;

/**
 * Non-Divisible Subset
 * <p>
 * Given a set of distinct integers, print the size of a maximal subset of S where the sum of any 2 numbers in S' is not
 * evenly divisible by k.
 */
public class NonDivisibleSubset {
    static int nonDivisibleSubset(int k, int[] S) {
        int maxLength = 0;
        for (int i = 0; i < S.length; i++) {
            int currSum = S[i], currLength = 0;
            for (int j = i + 1; j < S.length; j++) {
                if (currSum + S[j] % k != 0) {
                    currSum += S[j];
                    currLength++;
                }
            }
            maxLength = Math.max(currLength, maxLength);
        }
        return maxLength;
    }
}
