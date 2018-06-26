package problem;

/**
 * 413. Arithmetic Slices
 * <p>
 * A sequence of number is called arithmetic if it consists of at least three elements and if
 * the difference between any two consecutive elements is the same.
 * <p>
 * A zero-indexed array A consisting of N numbers is given. A slice of that array is
 * any pair of integers (P, Q) such that 0 <= P < Q < N.
 * <p>
 * A slice (P, Q) of array A is called arithmetic if the sequence:
 * A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.
 * <p>
 * The function should return the number of arithmetic slices in the array A.
 */
public class ArithmeticSlices {

    private int count = 0;

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) return 0;
        
        for (int i = 0; i < A.length; i++) {
            countSequence(A, i);
        }
        return count;
    }

    private void countSequence(int[] arr, int i) {
        if (i >= arr.length - 2) return;

        int diff = arr[i + 1] - arr[i];

        while (i < arr.length - 2 && diff == arr[i + 2] - arr[i + 1]) {
            count++;
            i++;
        }
    }
}
