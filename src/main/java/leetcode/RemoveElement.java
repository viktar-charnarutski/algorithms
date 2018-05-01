package leetcode;

/**
 * 27. Remove Element
 * <p>
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place
 * with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int idx = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                if (count == 0) idx = i;
                count++;
            } else if (count > 0) {
                nums[idx++] = nums[i];
            }
        }
        return nums.length - count;
    }
}
