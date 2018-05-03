package search;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        BinarySearch ins = new BinarySearch();
        int[] input = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertTrue(ins.binarySearch(input, 6));
    }
}