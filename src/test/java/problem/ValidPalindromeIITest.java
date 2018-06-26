package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class ValidPalindromeIITest {

    @Test
    public void validPalindrome() {
        ValidPalindromeII ins = new ValidPalindromeII();

        assertTrue(ins.validPalindrome("aba"));
        assertTrue(ins.validPalindrome("abca"));
        assertFalse(ins.validPalindrome("abcd"));
        assertFalse(ins.validPalindrome("abc"));
    }
}