package strings.easy;

import org.junit.Test;

import static org.junit.Assert.*;

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