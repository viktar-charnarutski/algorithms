package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequenceTest {

    @Test
    public void longestCommonSubsequence1() {
        assertEquals("ADH", new LongestCommonSubsequence().longestCommonSubsequence("ABCDGH", "AEDFHR"));
    }
    @Test
    public void longestCommonSubsequence2() {
        assertEquals("GTAB", new LongestCommonSubsequence().longestCommonSubsequence("AGGTAB", "GXTXAYB"));
    }
}