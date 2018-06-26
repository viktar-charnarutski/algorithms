package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * <p>
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * <p>
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
public class FindAllNumbersDisappearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dis = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                dis.add(i + 1);
            }
        }
        return dis;
    }

    public List<Integer> findDisappearedNumbersSlow(int[] nums) {

        List<Integer> dis = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            int left = 0;
            int right = nums.length - 1;
            boolean found = false;
            while (left <= right) {
                if (nums[left] == i || nums[right] == i) {
                    found = true;
                    break;
                }
                left++;
                right--;
            }
            if (!found) {
                dis.add(i);
            }
        }
        return dis;
    }
}
