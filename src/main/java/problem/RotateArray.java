package problem;

/**
 * 189. Rotate Array
 * <p>
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 1 || k == nums.length) return;

        k %= nums.length;

        int[] rotated = new int[nums.length];
        System.arraycopy(nums, nums.length - k, rotated, 0, k);
        System.arraycopy(nums, 0, rotated, k, nums.length - k);
        System.arraycopy(rotated, 0, nums, 0, nums.length);
    }
}
