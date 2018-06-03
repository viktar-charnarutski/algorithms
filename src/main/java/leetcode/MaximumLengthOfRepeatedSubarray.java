package leetcode;

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
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    max = Math.max(count(A, B, i, j), max);
                }
            }
        }
        return max;
    }

    private static int count(int[] A, int[] B, int i, int j) {
        int count = 0;
        while (i < A.length && j < B.length && A[i] == B[j]) {
            count++;
            i++;
            j++;
        }
        return count;
    }
}
