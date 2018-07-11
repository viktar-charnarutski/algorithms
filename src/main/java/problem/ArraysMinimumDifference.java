package problem;

import java.util.Arrays;

/**
 * Minimum Difference of Two Arrays.
 *
 * Given two arrays of integers(A and B), now we are going to find an element in array A which is A[i],
 * and another element in array B which is B[j], so that the difference between A[i] and B[j] (|A[i] - B[j]|)
 * is as small as possible, return their smallest difference.
 * A = [2, 5, 8]
 * B = [5, 3, 6, 9]
 */
public class ArraysMinimumDifference {
    public int findMinDiff(int[] arrA, int[] arrB) {
        Arrays.sort(arrB);
        int min = Integer.MAX_VALUE;
        for (int numA : arrA) {
            int minDiff = searchForMinDiff(numA, arrB);
            min = Math.min(min, Math.abs(numA - minDiff));
        }
        return min;
    }

    private int searchForMinDiff(int num, int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int midElement = arr[mid];
            if (midElement == num) {
                start = mid;
                break;
            } else if (midElement < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
