package problem;

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
        int start = 0, count = 0, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= L && A[i] <= R) {
                sum += i - start + 1;
                count = i - start + 1;
            } else if (A[i] < L) {
                sum += count;
            } else {
                start = i + 1;
                count = 0;
            }
        }
        return sum;
    }
}
