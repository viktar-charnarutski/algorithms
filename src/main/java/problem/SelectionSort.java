package problem;

/**
 * Selection Sort
 * <p>
 * Selection sort offers improved performance over bubble sort, especially for arrays with a large number of elements.
 * Where bubble sort accumulated the largest elements towards the end of the array, selection sort accumulates the
 * smallest elements at the beginning of the array.
 * <p>
 * Write a method that uses the selection sort algorithm to sort an input array of integers. See the hints and click the
 * red colored links for additonal details on the algorithm.
 */
public class SelectionSort {
    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int startOfUnsortedInd = 0;
        while (startOfUnsortedInd < arr.length) {
            int currMinInd = startOfUnsortedInd;
            for (int i = currMinInd + 1; i < arr.length; i++) {
                if (arr[i] < arr[currMinInd]) {
                    currMinInd = i;
                }
            }
            if (currMinInd > startOfUnsortedInd) {
                swap(arr, startOfUnsortedInd, currMinInd);
            }
            startOfUnsortedInd++;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
