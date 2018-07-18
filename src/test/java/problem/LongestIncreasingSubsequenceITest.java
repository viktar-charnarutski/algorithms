package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestIncreasingSubsequenceITest {

    @Test
    public void longestIncreasingSubsequence1() {
        assertEquals(6, new LongestIncreasingSubsequenceI().longestIncreasingSubsequence(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}));
    }

    @Test
    public void longestIncreasingSubsequence2() {
        assertEquals(1, new LongestIncreasingSubsequenceI().longestIncreasingSubsequence(new int[]{100, 22, 9, 8, 1}));
    }

    @Test
    public void longestIncreasingSubsequence3() {
        assertEquals(1, new LongestIncreasingSubsequenceI().longestIncreasingSubsequence(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void longestIncreasingSubsequence4() {
        assertEquals(6, new LongestIncreasingSubsequenceI().longestIncreasingSubsequence(new int[]{1, 2, 3, 4, 5, 6}));
    }
}