package problem;

import java.util.Arrays;

/**
 * 923. 3Sum With Multiplicity
 * <p>
 * Given an integer array A, and an integer target, return the number of tuples i, j, k  such that i < j < k and
 * A[i] + A[j] + A[k] == target.
 * <p>
 * As the answer can be very large, return it modulo 10^9 + 7.
 */
public class ThreeSumWithMultiplicity {
    public int threeSumMulti(int[] A, int target) {
        int modulo = 1000000007;
        Arrays.sort(A);
        long res = count(A, target, 0);
        return (int) (res % modulo);
    }

    private long count(int[] A, int target, int i) {
        if (target == 0) {
            return 1;
        }
        if (target < 0 || i >= A.length) {
            return 0;
        }
        return count(A, target - A[i], i + 1) + count(A, target, i + 1);
    }
}
