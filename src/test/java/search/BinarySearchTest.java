package search;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        BinarySearch ins = new BinarySearch();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertTrue(ins.binarySearch(input, 6));
    }
}