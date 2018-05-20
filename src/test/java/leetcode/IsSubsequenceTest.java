package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSubsequenceTest {

    @Test
    public void isSubsequence1() {
        assertTrue(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void isSubsequence2() {
        assertFalse(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void isSubsequence3() {
        assertFalse(new IsSubsequence().isSubsequence("aec", "abcde"));
    }

    @Test
    public void isSubsequence4() {
        assertTrue(new IsSubsequence().isSubsequence("ace", "abcde"));
    }

    @Test
    public void isSubsequence5() {
        assertFalse(new IsSubsequence().isSubsequence("a", "qbcde"));
    }
}