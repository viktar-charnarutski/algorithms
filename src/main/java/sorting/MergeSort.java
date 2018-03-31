package sorting;

/**
 * Merge Sort implementation.
 */
public class MergeSort {

    public void mergeSort(int[] arr) {
        mergeSort(arr, new int[arr.length], 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int[] tmp, int leftStart, int rightEnd) {

        if (leftStart < rightEnd) {

            int middle = (leftStart + rightEnd) / 2;
            mergeSort(arr, tmp, leftStart, middle);
            mergeSort(arr, tmp, middle + 1, rightEnd);

            merge(arr, tmp, leftStart, rightEnd);
        }

    }

    private void merge(int[] arr, int[] tmp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = (rightEnd - leftStart) + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {

            if (arr[left] < arr[right]) {
                tmp[index] = arr[left];
                left++;
            } else {
                tmp[index] = arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr, left, tmp, index, leftEnd - left + 1);
        System.arraycopy(arr, right, tmp, index, rightEnd - right + 1);
        System.arraycopy(tmp, leftStart, arr, leftStart, size);
    }

}
