package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class FindTheDifferenceTest {

    @Test
    public void findTheDifference() {
        FindTheDifference ins = new FindTheDifference();

        assertTrue('e' == ins.findTheDifference("abcd", "abcde"));
        assertTrue('a' == ins.findTheDifference("a", "aa"));
        assertTrue('y' == ins.findTheDifference("", "y"));
    }
}