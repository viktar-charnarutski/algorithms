package leetcode;

/**
 * 162. Find Peak Element
 * <p>
 * A peak element is an element that is greater than its neighbors.
 * <p>
 * Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
 * <p>
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length < 3) return -1;
        int l = 0, c = 1, r = 2;
        while (r < nums.length) {
            if (nums[l] < nums[c] && nums[c] > nums[r]) return c;
            l++;
            c++;
            r++;
        }
        return -1;
    }
}
