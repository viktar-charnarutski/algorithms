package problem;

/**
 * 713. Subarray Product Less Than K
 * <p>
 * Your are given an array of positive integers nums.
 * <p>
 * Count and print the number of (contiguous) subarrays where the product of all the elements in the subarray is less
 * than k.
 */
public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 1) return 0;
        int res = 0, left = 0,  curr = 1;
        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];
            while (curr >= k) {
                curr /= nums[left++];
            }
            res += right - left + 1;
        }
        return res;
    }
}
