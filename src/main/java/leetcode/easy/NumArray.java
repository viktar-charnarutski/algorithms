package leetcode.easy;

import javafx.util.Pair;

import java.util.HashMap;

/**
 * 303. Range Sum Query - Immutable
 * <p>
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 */
public class NumArray {

    private HashMap<Pair<Integer, Integer>, Integer> sum = new HashMap<>();

    public NumArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum += nums[j];
                sum.put(new Pair<>(i, j), currSum);
            }
        }
    }

    public int sumRange(int i, int j) {
        return sum.get(new Pair<>(i, j));
    }
}
