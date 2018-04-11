package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * <p>
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> num1Map = new HashMap<>();
        for (int i : nums1) {
            if (num1Map.containsKey(i)) {
                num1Map.put(i, num1Map.get(i) + 1);
            } else {
                num1Map.put(i, 1);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int num : nums2) {
            Integer count = num1Map.get(num);
            if (count != null && count != 0) {
                res.add(num);
                num1Map.put(num, count - 1);
            }
        }

        int[] output = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            output[i] = res.get(i);
        }

        return output;
    }
}
