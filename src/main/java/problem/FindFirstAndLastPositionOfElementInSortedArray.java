package problem;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * <p>
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target
 * value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums == null || nums.length == 0) {
            return res;
        }

        int ind = findIndex(nums, target);
        if (found(ind, nums, target)) {
            res[0] = findLeftIndex(nums, target, ind);
            res[1] = findRightIndex(nums, target, ind);
        }
        return res;
    }

    private boolean found(int ind, int[] nums, int target) {
        return ind >= 0 && ind < nums.length && nums[ind] == target;
    }

    int findIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    private int findLeftIndex(int[] nums, int target, int ind) {
        int left = ind;
        while (left - 1 >= 0 && nums[left - 1] == target) {
            left--;
        }
        return left;
    }

    private int findRightIndex(int[] nums, int target, int ind) {
        int right = ind;
        while (right + 1 < nums.length && nums[right + 1] == target) {
            right++;
        }
        return right;
    }
}
