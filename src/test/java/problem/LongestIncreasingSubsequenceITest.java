package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestIncreasingSubsequenceITest {

    @Test
    public void longestIncreasingSubsequence() {
        assertEquals(6, new LongestIncreasingSubsequenceI().longestIncreasingSubsequence(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}));
    }
}