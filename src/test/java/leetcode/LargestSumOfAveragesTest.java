package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestSumOfAveragesTest {

    @Test
    public void largestSumOfAverages1() {
        assertEquals(20, new LargestSumOfAverages().largestSumOfAverages(new int[]{9, 1, 2, 3, 9}, 3), 0.0);
    }
}