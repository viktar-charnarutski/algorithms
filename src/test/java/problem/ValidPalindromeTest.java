package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class ValidPalindromeTest {

    @Test
    public void isPalindrome() {
        ValidPalindrome ins = new ValidPalindrome();

        assertTrue(ins.isPalindrome(""));
        assertTrue(ins.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(ins.isPalindrome("race a car"));

    }
}