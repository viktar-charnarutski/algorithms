package sorting;

/**
 * Quick Sort implementation.
 * <p>
 * It picks a mediate element as pivot and partitions the given array around the picked pivot.
 */
public class QuickSort {

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {

            int pivot = array[(left + right) / 2];
            int index = partition(array, left, right, pivot);

            quickSort(array, left, index - 1);
            quickSort(array, index, right);
        }
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {

            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
            }

            left++;
            right--;
        }
        return left;
    }

    private static void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
