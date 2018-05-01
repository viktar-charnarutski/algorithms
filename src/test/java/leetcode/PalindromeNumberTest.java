package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeNumberTest {

    @Test
    public void isPalindrome_true() {
        PalindromeNumber ins = new PalindromeNumber();
        assertTrue(ins.isPalindrome(1));
        assertTrue(ins.isPalindrome(121));
        assertTrue(ins.isPalindrome(123454321));
        assertTrue(ins.isPalindrome(1234554321));
    }
    @Test
    public void isPalindrome_false() {
        PalindromeNumber ins = new PalindromeNumber();
        assertFalse(ins.isPalindrome(12));
        assertFalse(ins.isPalindrome(1212));
        assertFalse(ins.isPalindrome(1234564321));
        assertFalse(ins.isPalindrome(Integer.MAX_VALUE));
        assertFalse(ins.isPalindrome(Integer.MIN_VALUE));
    }
}