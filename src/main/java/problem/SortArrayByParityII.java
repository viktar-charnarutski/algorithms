package problem;

import java.util.Arrays;

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
        for (int evenIndex = 0, oddIndex = 1; evenIndex < A.length; evenIndex += 2) {
            if (A[evenIndex] % 2 != 0) {
                while (A[oddIndex] % 2 == 1) {
                    oddIndex += 2;
                }
                int tmp = A[evenIndex];
                A[evenIndex] = A[oddIndex];
                A[oddIndex] = tmp;
            }
        }
        return A;
    }

    public int[] sortArrayByParityII1(int[] A) {
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
