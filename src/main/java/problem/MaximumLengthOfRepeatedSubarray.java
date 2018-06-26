package problem;

/**
 * 718. Maximum Length of Repeated Subarray
 * <p>
 * Given two integer arrays A and B, return the maximum length of an subarray that appears in both arrays.
 * <p>
 * 1 <= len(A), len(B) <= 1000
 * 0 <= A[i], B[i] < 100
 * <p>
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 3: 3, 2, 1
 */
public class MaximumLengthOfRepeatedSubarray {
    public int findLength(int[] A, int[] B) {
        int max = 0;
        int[][] memo = new int[A.length + 1][B.length + 1];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    memo[i + 1][j + 1] = Math.max(memo[i][j] + 1, memo[i + 1][j + 1]);
                    max = Math.max(memo[i + 1][j + 1], max);
                }
            }
        }
        return max;
    }
}
