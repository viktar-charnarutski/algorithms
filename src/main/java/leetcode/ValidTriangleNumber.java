package leetcode;

/**
 * 611. Valid Triangle Number
 * <p>
 * Given an array consists of non-negative integers, your task is to count the number of triplets chosen from
 * the array that can make triangles if we take them as side lengths of a triangle.
 */
public class ValidTriangleNumber {

    public int triangleNumber(int[] nums) {
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isValidTriangle(nums[i], nums[j], nums[k])) count++;
                }
            }
        }
        return count;
    }

    private boolean isValidTriangle(int i1, int i2, int i3) {
        return i1 + i2 > i3 && i1 + i3 > i2 && i2 + i3 > i1;
    }
}
