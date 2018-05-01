package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class RomanToIntegerTest {

    @Test
    public void romanToInt() {
        RomanToInteger rit = new RomanToInteger();
        assertTrue(1 == rit.romanToInt("I"));
        assertTrue(2 == rit.romanToInt("II"));
        assertTrue(3 == rit.romanToInt("III"));
        assertTrue(4 == rit.romanToInt("IV"));
        assertTrue(5 == rit.romanToInt("V"));
        assertTrue(6 == rit.romanToInt("VI"));
        assertTrue(7 == rit.romanToInt("VII"));
        assertTrue(8 == rit.romanToInt("VIII"));
        assertTrue(9 == rit.romanToInt("IX"));
        assertTrue(10 == rit.romanToInt("X"));
        assertTrue(11 == rit.romanToInt("XI"));
        assertTrue(12 == rit.romanToInt("XII"));
        assertTrue(13 == rit.romanToInt("XIII"));
        assertTrue(14 == rit.romanToInt("XIV"));

        assertTrue(39 == rit.romanToInt("XXXIX"));
        assertTrue(40 == rit.romanToInt("XL"));

        assertTrue(89 == rit.romanToInt("LXXXIX"));
        assertTrue(90 == rit.romanToInt("XC"));

        assertTrue(99 == rit.romanToInt("XCIX"));

        assertTrue(400 == rit.romanToInt("CD"));

        assertTrue(700 == rit.romanToInt("DCC"));

        assertTrue(900 == rit.romanToInt("CM"));
        assertTrue(1100 == rit.romanToInt("MC"));
    }
}