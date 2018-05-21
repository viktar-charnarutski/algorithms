package leetcode;

/**
 * 287. Find the Duplicate Number
 * <p>
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate number,
 * find the duplicate one.
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        for (int i : nums) {
            int num = Math.abs(i);
            if (nums[num - 1] < 0) {
                return num;
            } else {
                nums[num - 1] = -nums[num - 1];
            }

        }
        return -1;
    }
}
