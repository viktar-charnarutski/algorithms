package leetcode;

/**
 * 795. Number of Subarrays with Bounded Maximum
 * <p>
 * We are given an array A of positive integers, and two positive integers L and R (L <= R).
 * <p>
 * Return the number of (contiguous, non-empty) subarrays such that the value of the maximum array element
 * in that subarray is at least L and at most R.
 */
public class NumberOfSubarraysWithBoundedMaximum {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int j = 0, count = 0, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= L && A[i] <= R) {
                sum += i - j + 1;
                count = i - j + 1;
            } else if (A[i] < L) {
                sum += count;
            } else {
                j = i + 1;
                count = 0;
            }
        }
        return sum;
    }
}
