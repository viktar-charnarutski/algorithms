package problem;

/**
 * Pancake Sort
 * <p>
 * Given an array of integers arr:
 * <p>
 * Write a function flip(arr, k) that reverses the order of the first k elements in the array arr.
 * Write a function pancakeSort(arr) that sorts and returns the input array. You are allowed to use only the function
 * flip you wrote in the first step in order to make changes in the array.
 */
public class PancakeSort {
    public int[] pancakeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return arr;
        for (int i = arr.length - 1; i >= 0; i--) {
            int maxi = maxIndex(arr, i);
            flip(arr, maxi + 1);
            flip(arr, i + 1);
        }
        return arr;
    }

    int maxIndex(int[] arr, int end) {
        int i = 0, max = arr[0];
        for (int j = 1; j <= end; j++) {
            if (arr[j] > max) {
                max = arr[j];
                i = j;
            }
        }
        return i;
    }

    public void flip(int[] arr, int k) {
        for (int i = 0; i < k / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[k - i - 1];
            arr[k - i - 1] = tmp;
        }
    }
}
