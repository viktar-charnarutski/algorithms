package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromicSubstringsTest {

    @Test
    public void countSubstrings() {
        PalindromicSubstrings ins = new PalindromicSubstrings();
        assertEquals(3, ins.countSubstrings("abc"));
    }
    @Test
    public void countSubstrings1() {
        PalindromicSubstrings ins = new PalindromicSubstrings();
        assertEquals(6, ins.countSubstrings("aaa"));
    }
}