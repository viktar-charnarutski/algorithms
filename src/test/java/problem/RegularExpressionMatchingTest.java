package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionMatchingTest {

    @Test
    public void isMatch1() {
        assertTrue(new RegularExpressionMatching().isMatch("aa", "a"));
    }

    @Test
    public void isMatch2() {
        assertTrue(new RegularExpressionMatching().isMatch("aa", "a*"));
    }

    @Test
    public void isMatch3() {
        assertTrue(new RegularExpressionMatching().isMatch("aa", ".*"));
    }

    @Test
    public void isMatch4() {
        assertTrue(new RegularExpressionMatching().isMatch("aab", "c*a*b"));
    }

    @Test
    public void isMatch5() {
        assertFalse(new RegularExpressionMatching().isMatch("mississippi", "mis*is*p*."));
    }
}