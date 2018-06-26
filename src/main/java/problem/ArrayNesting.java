package problem;

/**
 * 565. Array Nesting
 * <p>
 * A zero-indexed array A of length N contains all integers from 0 to N-1.
 * Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... }
 * subjected to the rule below.
 * <p>
 * Suppose the first element in S starts with the selection of element A[i] of index = i,
 * the next element in S should be A[A[i]], and then A[A[A[i]]]… By that analogy,
 * we stop adding right before a duplicate element occurs in S.
 */
public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MAX_VALUE) {
                int count = 0;
                int curr = nums[i];
                while (nums[curr] != Integer.MAX_VALUE) {
                    count++;
                    int tmp = curr;
                    curr = nums[curr];
                    nums[tmp] = Integer.MAX_VALUE;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
