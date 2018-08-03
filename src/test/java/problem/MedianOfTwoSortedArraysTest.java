package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void findMedianSortedArrays1() {
        assertEquals(2.0, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.0);
    }

    @Test
    public void findMedianSortedArrays2() {
        assertEquals(2.5, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.0);
    }

    @Test
    public void mergeArrays() {
        assertEquals(Arrays.asList(-3, 1, 2, 3, 4, 5, 6, 7, 8),
                new MedianOfTwoSortedArrays().mergeArrays(new int[]{1, 2, 3, 4}, new int[]{-3, 3, 4, 5, 6, 7, 8}));
    }
}