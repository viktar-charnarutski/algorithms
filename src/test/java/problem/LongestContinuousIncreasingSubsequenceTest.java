package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class LongestContinuousIncreasingSubsequenceTest {
    private LongestContinuousIncreasingSubsequence ins = new LongestContinuousIncreasingSubsequence();

    @Test
    public void findLengthOfLCIS() {
        assertSame(3, ins.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        assertSame(4, ins.findLengthOfLCIS(new int[]{1, 3, 5, 7}));
        assertSame(1, ins.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
        assertSame(4, ins.findLengthOfLCIS(new int[]{1, 3, 5, 4, 2, 3, 4, 5}));
        assertSame(0, ins.findLengthOfLCIS(new int[]{}));
        assertSame(4, ins.findLengthOfLCIS(new int[]{1, 2, 3, 1, 2, 3, 1, 2, 1, 2, 3, 4, 1, 2, 3}));
        assertSame(0, ins.findLengthOfLCIS(null));
    }
}