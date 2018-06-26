package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestSumOfAveragesTest {

    @Test
    public void largestSumOfAverages1() {
        assertEquals(20, new LargestSumOfAverages().largestSumOfAverages(new int[]{9, 1, 2, 3, 9}, 3), 0.0);
    }

    @Test
    public void largestSumOfAverages2() {
        assertEquals(19.5, new LargestSumOfAverages().largestSumOfAverages(new int[]{9, 1, 2, 9}, 3), 0.0);
    }

    @Test
    public void largestSumOfAverages3() {
        assertEquals(18.166666666666668, new LargestSumOfAverages().largestSumOfAverages(new int[]{4, 1, 7, 5, 6, 2, 3}, 4), 0.0);
    }
}