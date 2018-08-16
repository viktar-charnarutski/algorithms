package problem;

/**
 * Merge Sorted Arrays
 * <p>
 * The idea behind the classic Mergesort algorithm is to divide an array in half, sort each half, and then use
 * a merge() method to merge the two halves into a single sorted array.
 * <p>
 * <p>
 * Implement the merge() method that takes in two sorted arrays and returns a third sorted array that contains elements
 * of both the input arrays.
 * <p>
 * You can assume that the input arrays will always be sorted in ascending order and can have different sizes.
 */
public class MergeSortedArrays {
    public int[] merge(int[] arrLeft, int[] arrRight) {
        if (arrLeft == null || arrLeft.length == 0) {
            return arrRight;
        }
        if (arrRight == null || arrRight.length == 0) {
            return arrLeft;
        }
        int[] res = new int[arrLeft.length + arrRight.length];
        int il = 0, ir = 0, ires = 0;
        while (ires < res.length) {
            if ((il >= arrLeft.length) || (ir < arrRight.length && arrRight[ir] < arrLeft[il])) {
                res[ires] = arrRight[ir];
                ires++;
                ir++;
            } else if ((ir >= arrRight.length) || (il < arrLeft.length && arrLeft[il] < arrRight[ir])) {
                res[ires] = arrLeft[il];
                ires++;
                il++;
            } else {
                res[ires++] = arrLeft[il];
                res[ires++] = arrRight[ir];
                il++;
                ir++;
            }
        }
        return res;
    }
}
