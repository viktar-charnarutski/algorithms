package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperPalindromesTest {

    @Test
    public void superpalindromesInRange() {
        assertEquals(4, new SuperPalindromes().superpalindromesInRange("4", "1000"));
    }
}