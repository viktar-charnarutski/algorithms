package leetcode.easy;

/**
 * 414. Third Maximum Number
 * <p>
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2 && max1 != nums[i]) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] >= max3 && max2 != nums[i] && max1 != nums[i]) {
                max3 = nums[i];
            }

            if (nums[i] == Integer.MIN_VALUE) {
                flag = true;
            }
        }

        if (flag && max2 != Integer.MIN_VALUE) {
            return max3;
        } else if (flag && max2 == Integer.MIN_VALUE) {
            return max1;
        } else if (!flag && max3 == Integer.MIN_VALUE) {
            return max1;
        }

        return max3;
    }
}
