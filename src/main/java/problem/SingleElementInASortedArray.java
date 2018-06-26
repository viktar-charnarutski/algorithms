package problem;

/**
 * 540. Single Element in a Sorted Array
 * <p>
 * Given a sorted array consisting of only integers where every element appears twice
 * except for one element which appears once. Find this single element that appears only once.
 */
public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];

        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i - 1] != nums[i]) return nums[i - 1];
        }
        return nums[nums.length - 1];
    }
}
