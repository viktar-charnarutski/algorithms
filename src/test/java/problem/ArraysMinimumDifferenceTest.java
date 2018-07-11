package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysMinimumDifferenceTest {

    @Test
    public void findMinDiff1() {
        assertEquals(0, new ArraysMinimumDifference().findMinDiff(new int[]{2, 5, 8}, new int[]{5, 3, 6, 9}));
    }

    @Test
    public void findMinDiff2() {
        assertEquals(1, new ArraysMinimumDifference().findMinDiff(new int[]{2, 5, 8}, new int[]{11, 3, 6, 9}));
    }
}