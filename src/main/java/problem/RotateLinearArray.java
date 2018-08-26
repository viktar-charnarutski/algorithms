package problem;

/**
 * Rotate Linear Array
 * <p>
 * Rotate an array to the left by k positions without using extra space.k can be greater than the size of the array.
 */
public class RotateLinearArray {
    public static int[] rotateLeft(int[] arr, int k) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        if (k > arr.length) {
            k %= arr.length;
        }
        rotate(arr, 0, arr.length - 1);
        rotate(arr, 0, arr.length - k - 1);
        rotate(arr, arr.length - k, arr.length - 1);
        return arr;
    }

    private static void rotate(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
}
