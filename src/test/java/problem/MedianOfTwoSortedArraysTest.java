package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void findMedianSortedArrays1() {
        assertSame(2.0, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    public void findMedianSortedArrays2() {
        assertSame(2.5, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}