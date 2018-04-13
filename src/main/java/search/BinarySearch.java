package search;

/**
 * Binary Search implementation.
 */
public class BinarySearch {

    public boolean binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private boolean binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) return false;

        int mid = (right + left) / 2;

        if (arr[mid] == target) {
            return true;
        } else if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }

}
