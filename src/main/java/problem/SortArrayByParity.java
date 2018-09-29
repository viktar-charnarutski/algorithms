package problem;

/**
 * 905. Sort Array By Parity
 * <p>
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A,
 * followed by all the odd elements of A.
 * <p>
 * You may return any answer array that satisfies this condition.
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        if (A == null || A.length <= 1) {
            return A;
        }
        int i = 0;
        while (i < A.length) {
            if (A[i] % 2 != 0) {
                int j = i + 1;
                while (j < A.length && A[j] % 2 != 0) {
                    j++;
                }
                if (j < A.length) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
            i++;
        }
        return A;
    }
}
