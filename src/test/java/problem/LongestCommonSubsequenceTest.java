package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequenceTest {

    @Test
    public void longestCommonSubsequence() {
        assertEquals("ADH", new LongestCommonSubsequence().longestCommonSubsequence("ABCDGH", "AEDFHR"));
    }
}