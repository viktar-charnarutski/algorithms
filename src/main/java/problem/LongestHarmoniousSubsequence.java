package problem;

import java.util.HashMap;

/**
 * 594. Longest Harmonious Subsequence
 * <p>
 * We define a harmonious array is an array where the difference between its maximum value and its minimum
 * value is exactly 1.
 * <p>
 * Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its
 * possible subsequences.
 */
public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        if (nums == null || nums.length < 2) return 0;

        HashMap<Integer, Integer> occ = new HashMap<>();
        for (int num : nums) {
            if (occ.containsKey(num)) {
                occ.put(num, occ.get(num) + 1);
            } else {
                occ.put(num, 1);
            }
        }

        int res = 0;

        for (int num : occ.keySet()) {

            if (occ.containsKey(num + 1)) {
                res = Math.max(occ.get(num) + occ.get(num + 1), res);
            }

        }

        return res;
    }
}
