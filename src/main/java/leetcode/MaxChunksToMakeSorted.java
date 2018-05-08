package leetcode;

/**
 * 769. Max Chunks To Make Sorted
 * <p>
 * Given an array arr that is a permutation of [0, 1, ..., arr.length - 1],
 * we split the array into some number of "chunks" (partitions), and individually sort each chunk.
 * <p>
 * After concatenating them, the result equals the sorted array.
 * <p>
 * What is the most number of chunks we could have made?
 */
public class MaxChunksToMakeSorted {

    public int maxChunksToSorted(int[] arr) {
        int[] max = new int[arr.length];
        int count = 0;

        max[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max[i] = Math.max(arr[i], max[i - 1]);
        }

        for (int i = 0; i < max.length; i++) {
            if (max[i] == i) count++;
        }
        return count;
    }
}
