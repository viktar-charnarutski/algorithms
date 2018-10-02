package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 907. Sum of Subarray Minimums
 * <p>
 * Given an array of integers A, find the sum of min(B), where B ranges over every (contiguous) subarray of A.
 * <p>
 * Since the answer may be large, return the answer modulo 10^9 + 7.
 */
public class SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] A) {
        if (A == null || A.length == 0) return 0;
        int res = 0;

        int[] left = new int[A.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            int count = 1;
            while (!stack.isEmpty() && stack.peek()[0] > A[i]) {
                count += stack.pop()[1];
            }
            stack.push(new int[]{A[i], count});
            left[i] = count;
        }

        int[] right = new int[A.length];
        stack.clear();

        for (int i = A.length - 1; i >= 0; i--) {
            int count = 1;
            while (!stack.isEmpty() && stack.peek()[0] >= A[i]) {
                count += stack.pop()[1];
            }
            stack.push(new int[]{A[i], count});
            right[i] = count;
        }
        for (int i = 0; i < left.length; i++) {
            res += A[i] * left[i] * right[i];
            res %= (int) 1e9 + 7;
        }
        return res;
    }
}
