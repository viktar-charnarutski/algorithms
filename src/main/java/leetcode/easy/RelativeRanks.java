package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 506. Relative Ranks
 * <p>
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
 * who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 */
public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {

        HashMap<Integer, Integer> positions = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            positions.put(nums[i], i);
        }

        Arrays.sort(nums);
        String[] result = new String[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            int inx = positions.get(nums[i]);
            if (i == nums.length - 1) {
                result[inx] = "Gold Medal";
            } else if (i == nums.length - 2){
                result[inx] = "Silver Medal";
            } else if (i == nums.length - 3){
                result[inx] = "Bronze Medal";
            } else {
                result[inx] = (nums.length - i) + "";
            }
        }

        return result;
    }
}
