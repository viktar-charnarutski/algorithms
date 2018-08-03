package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Median of Two Sorted Arrays
 * <p>
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * You may assume nums1 and nums2 cannot be both empty.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return 0.0;

        List<Integer> nums = mergeArrays(nums1, nums2);
        double med;
        int middle = nums.size() / 2;
        if (nums.size() % 2 != 0) {
            med = nums.get(middle);
        } else {
            med = ((double) (nums.get(middle - 1) + nums.get(middle))) / 2;
        }
        return med;
    }

    List<Integer> mergeArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums = new ArrayList<>();
        int i1 = 0, i2 = 0;
        while (i1 < nums1.length || i2 < nums2.length) {
            int num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE;
            if (i1 < nums1.length) {
                num1 = nums1[i1];
            }
            if (i2 < nums2.length) {
                num2 = nums2[i2];
            }

            if (num1 < num2) {
                nums.add(num1);
                i1++;
            } else if (num2 < num1) {
                nums.add(num2);
                i2++;
            } else {
                nums.add(num1);
                nums.add(num2);
                i1++;
                i2++;
            }
        }
        return nums;
    }
}
