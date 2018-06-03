package leetcode;

/**
 * 525. Contiguous Array
 * <p>
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 */
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeros = 0, ones = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
                max = zeros == ones ? Math.max(j - i + 1, max) : max;
            }
        }
        return max;
    }
}
