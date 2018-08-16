package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArraysTest {

    @Test
    public void merge1() {
        int[] arrLeft = new int[]{2, 5, 7, 8};
        int[] arrRight = new int[]{2, 4, 7, 12, 32};
        assertArrayEquals(new int[]{2, 2, 4, 5, 7, 7, 8, 12, 32}, new MergeSortedArrays().merge(arrLeft, arrRight));
    }

    @Test
    public void merge2() {
        int[] arrLeft = new int[]{2, 4, 7, 12, 32};
        int[] arrRight = new int[]{2, 5, 7, 8};
        assertArrayEquals(new int[]{2, 2, 4, 5, 7, 7, 8, 12, 32}, new MergeSortedArrays().merge(arrLeft, arrRight));
    }
}