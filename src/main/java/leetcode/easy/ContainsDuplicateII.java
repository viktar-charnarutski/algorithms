package leetcode.easy;

/**
 * 219. Contains Duplicate II
 *
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array
 * such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < k) return false;

        for (int i = 0; i < nums.length - k; i++) {
            if (nums[i] == nums[i + k]) return true;
        }

        return false;
    }
}
