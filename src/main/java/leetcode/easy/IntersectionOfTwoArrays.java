package leetcode.easy;

import java.util.HashSet;

/**
 * 349. Intersection of Two Arrays
 * <p>
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> uniqNums1 = new HashSet<>();
        HashSet<Integer> ints = new HashSet<>();
        for (int num : nums1) {
            uniqNums1.add(num);
        }

        for (int num : nums2) {
            if (uniqNums1.contains(num)) {
                ints.add(num);
            }
        }

        int[] res = new int[ints.size()];
        int indx = 0;
        for (int num : ints) {
            res[indx++] = num;
        }
        return res;
    }
}
