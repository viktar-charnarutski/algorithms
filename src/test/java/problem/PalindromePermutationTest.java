package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromePermutationTest {

    @Test
    public void isPalindrome() {
        assertTrue(new PalindromePermutation().isPalindrome("tact coa"));
    }
}