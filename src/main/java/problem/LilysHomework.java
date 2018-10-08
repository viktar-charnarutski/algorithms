package problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Lily's Homework
 * <p>
 * Whenever George asks Lily to hang out, she's busy doing homework. George wants to help her finish it faster, but he's
 * in over his head! Can you help George understand Lily's homework so she can hang out with him?
 * <p>
 * Consider an array of n distinct integers. George can swap any two elements of the array any number of times. An
 * array is beautiful if the sum of |arr[i] - arr[i - 1]| among 0 < i < n is minimal.
 * <p>
 * Given the array arr, determine and return the minimum number of swaps that should be performed in order to make the
 * array beautiful.
 */
public class LilysHomework {
    static int lilysHomework(int[] arr) {

        int[] sarr = sortedCopyArray(arrayCopy(arr));
        int[] rarr = sortedCopyArray(arrayCopy(arr));
        reverse(rarr);

        return Math.min(lilysHomework(arrayCopy(arr), sarr), lilysHomework(arrayCopy(arr), rarr));
    }

    private static int[] arrayCopy(int[] arr) {
        int[] orig = new int[arr.length];
        System.arraycopy(arr, 0, orig, 0, arr.length);
        return orig;
    }

    static int lilysHomework(int[] arr, int[] sarr) {
        int count = 0;
        Map<Integer, Integer> indexedValsMap = indexedValsMap(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sarr[i]) {
                count++;
                indexedValsMap.put(arr[i], indexedValsMap.get(sarr[i]));
                swap(arr, i, indexedValsMap.get(sarr[i]));
            }
        }

        return count;
    }

    private static void swap(int[] arr, int s, int e) {
        int tmp = arr[s];
        arr[s] = arr[e];
        arr[e] = tmp;
    }

    private static Map<Integer, Integer> indexedValsMap(int arr[]) {
        Map<Integer, Integer> indexedValsMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            indexedValsMap.put(arr[i], i);
        }
        return indexedValsMap;
    }

    private static int[] sortedCopyArray(int[] arr) {
        int[] sarr = new int[arr.length];
        System.arraycopy(arr, 0, sarr, 0, arr.length);
        Arrays.sort(sarr);
        return sarr;
    }

    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }
}
