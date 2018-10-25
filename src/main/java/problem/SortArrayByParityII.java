package problem;

/**
 * 922. Sort Array By Parity II
 * <p>
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 * <p>
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 * <p>
 * You may return any answer array that satisfies this condition.
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int evenIndex = 0, oddIndex = 1;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 0) {
                res[evenIndex] = A[i];
                evenIndex += 2;
            } else {
                res[oddIndex] = A[i];
                oddIndex += 2;
            }
        }
        return res;
    }
}
