package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class LongestPalindromeTest {
    private LongestPalindrome ins = new LongestPalindrome();
    @Test
    public void longestPalindrome() {
        assertSame(7, ins.longestPalindrome("abccccdd"));
        assertSame(1, ins.longestPalindrome("a"));
        assertSame(1, ins.longestPalindrome("ab"));
        assertSame(3, ins.longestPalindrome("aba"));
        assertSame(1, ins.longestPalindrome("abxc"));
        assertSame(6, ins.longestPalindrome("AAAAAA"));
        assertSame(7, ins.longestPalindrome("aaaAaaaa"));
    }
}