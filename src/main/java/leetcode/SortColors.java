package leetcode;

/**
 * 75. Sort Colors
 * <p>
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same
 * color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p>
 * Note: You are not suppose to use the library's sort function for this problem.
 * <p>
 * Example:
 * <p>
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */
public class SortColors {
    public void sortColors(int[] nums) {
        partition(nums, 0);
        partition(nums, 1);
    }

    private void partition(int[] nums, int pivot) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] <= pivot) left++;
            while (left < right && nums[right] > pivot) right--;
            if (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
            left++;
            right--;
        }
    }

    public void sortColors1(int[] nums) {
        int red = 0, white = 0;
        for (int n : nums) {
            switch (n) {
                case 0: {
                    red++;
                    break;
                }
                case 1: {
                    white++;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = red-- > 0 ? 0 : white-- > 0 ? 1 : 2;
        }
    }
}
