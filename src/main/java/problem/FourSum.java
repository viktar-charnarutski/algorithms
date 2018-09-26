package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 18. 4Sum
 * <p>
 * Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such
 * that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate quadruplets.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int currSum = nums[i] + nums[j];
                int remSum = target - currSum;
                int start = j + 1, end = nums.length - 1;
                while (start < end) {
                    if (nums[start] + nums[end] == remSum) {
                        List<Integer> currRes = new ArrayList<>();
                        currRes.add(nums[i]);
                        currRes.add(nums[j]);
                        currRes.add(nums[start]);
                        currRes.add(nums[end]);
                        res.add(currRes);
                        break;
                    }
                    if (nums[start] + nums[end] > remSum) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        return res;
    }
}
