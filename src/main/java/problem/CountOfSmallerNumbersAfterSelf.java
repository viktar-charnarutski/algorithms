package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 315. Count of Smaller Numbers After Self
 * <p>
 * You are given an integer array nums and you have to return a new counts array.
 * The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
 */
public class CountOfSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        if (nums == null || nums.length == 0)
            return Collections.emptyList();

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) count++;
            }
            res.add(i, count);
        }

        return res;
    }
}
