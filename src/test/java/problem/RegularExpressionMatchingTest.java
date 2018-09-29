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
}