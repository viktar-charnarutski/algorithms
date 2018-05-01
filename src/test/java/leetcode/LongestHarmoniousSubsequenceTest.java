package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class LongestHarmoniousSubsequenceTest {

    @Test
    public void findLHS() {
        LongestHarmoniousSubsequence ins = new LongestHarmoniousSubsequence();
        assertSame(5, ins.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
    }

    @Test
    public void findLHS_empty_input() {
        LongestHarmoniousSubsequence ins = new LongestHarmoniousSubsequence();
        assertSame(0, ins.findLHS(new int[]{}));
    }

    @Test
    public void findLHS_null_input() {
        LongestHarmoniousSubsequence ins = new LongestHarmoniousSubsequence();
        assertSame(0, ins.findLHS(null));
    }

    @Test
    public void findLHS_no_subsequence() {
        LongestHarmoniousSubsequence ins = new LongestHarmoniousSubsequence();
        assertSame(0, ins.findLHS(new int[]{1, 3, 5, 7, 9, 11, 13, 17}));
    }
    @Test
    public void findLHS_2_items_subsequence() {
        LongestHarmoniousSubsequence ins = new LongestHarmoniousSubsequence();
        assertSame(2, ins.findLHS(new int[]{1, 2}));
    }
}