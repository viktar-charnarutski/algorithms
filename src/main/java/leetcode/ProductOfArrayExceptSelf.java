package leetcode;

/**
 * 238. Product of Array Except Self
 * <p>
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is
 * equal to the product of all the elements of nums except nums[i].
 * <p>
 * Solve it without division and in O(n).
 * <p>
 * For example, given [1,2,3,4], return [24,12,8,6].
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int tmp = 1;
        for (int i = 0; i < n; i++) {
            res[i] = tmp;
            tmp *= nums[i];
        }

        tmp = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= tmp;
            tmp *= nums[i];
        }

        return res;
    }
}
