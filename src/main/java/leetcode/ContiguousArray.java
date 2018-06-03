package leetcode;

/**
 * 525. Contiguous Array
 * <p>
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 */
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int[][] memo = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                memo[i][0] = i > 0 ? memo[i - 1][0] + 1 : 1;
                memo[i][1] = i > 0 ? memo[i - 1][1] : 0;
            } else {
                memo[i][0] = i > 0 ? memo[i - 1][0] : 0;
                memo[i][1] = i > 0 ? memo[i - 1][1] + 1 : 1;
            }
            max = memo[i][0] == memo[i][1] ? memo[i][0] * 2 : max;
        }
        return max;
    }
}
