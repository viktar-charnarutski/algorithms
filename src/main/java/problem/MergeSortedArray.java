package problem;

/**
 * 88. Merge Sorted Array
 * <p>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n)
 * to hold additional elements from nums2.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int inx1 = m - 1;
        int inx2 = n - 1;
        int inxRes = n + m - 1;

        while (inx1 >= 0 && inx2 >= 0) {

            if (nums2[inx2] > nums1[inx1]) {
                nums1[inxRes] = nums2[inx2];
                inx2--;
            } else {
                nums1[inxRes] = nums1[inx1];
                inx1--;
            }
            inxRes--;
        }

        while (inxRes >= 0 && inx2 >= 0) {
            nums1[inxRes--] = nums2[inx2--];
        }
    }
}
