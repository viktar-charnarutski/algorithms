package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequenceTest {

    @Test
    public void longestCommonSubsequence1() {
        assertEquals(3, new LongestCommonSubsequence().longestCommonSubsequence("ABCDGH", "AEDFHR"));
    }
    @Test
    public void longestCommonSubsequence2() {
        assertEquals(4, new LongestCommonSubsequence().longestCommonSubsequence("AGGTAB", "GXTXAYB"));
    }
}