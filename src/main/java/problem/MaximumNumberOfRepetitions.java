package problem;

/**
 * Maximum Number of Repetitions
 * <p>
 * Given an Array of integers, write a method that will return the integer with the maximum number of repetitions.
 * Your code is expected to run with O(n) time complexity and O(1) space complexity. The elements in the array are
 * between 0 to size(array) - 1 and the array will not be empty.
 */
public class MaximumNumberOfRepetitions {
    public static int getMaxRepetition(int[] a) {
        if (a == null || a.length == 0) {
            return -1;
        }
        // Numbers stored in the array are constrained by the length of the array.
        // So, we can track repetitions by adding a constant num (array length) to a val stored for an index which
        // is our current number.
        for (int i = 0; i < a.length; i++) {
            a[a[i] % a.length] += a.length;
        }

        int ind = 0, reps = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > reps) {
                ind = i;
                reps = a[i];
            }
        }
        return ind;
    }
}
