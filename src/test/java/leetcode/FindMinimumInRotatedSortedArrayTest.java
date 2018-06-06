package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void findMin1() {
        assertEquals(1, new FindMinimumInRotatedSortedArray().findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void findMin2() {
        assertEquals(0, new FindMinimumInRotatedSortedArray().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }
}