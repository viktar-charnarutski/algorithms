package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void lengthOfLIS() {
        assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}