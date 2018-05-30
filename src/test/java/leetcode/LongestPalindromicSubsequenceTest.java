package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubsequenceTest {

    @Test
    public void longestPalindromeSubseq1() {
        assertEquals(4, new LongestPalindromicSubsequence().longestPalindromeSubseq("bbbab"));
    }

    @Test
    public void longestPalindromeSubseq2() {
        assertEquals(2, new LongestPalindromicSubsequence().longestPalindromeSubseq("cbbd"));
    }
}