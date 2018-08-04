package problem;

/**
 * 152. Maximum Product Subarray
 * <p>
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has
 * the largest product.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = Integer.MIN_VALUE, curr = 1;
        int hi = 0, lo = 0;
        while (hi < nums.length) {
            curr *= nums[hi++];
            if (curr >= max) {
                max = curr;
            } else {
                while (lo != hi) {
                    curr /= nums[lo++];
                }
            }
        }
        return max;
    }
}
