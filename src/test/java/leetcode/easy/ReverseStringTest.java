package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class ReverseStringTest {

    @Test
    public void testReverseString() {
        assertEquals("olleh", new ReverseString().reverseString("hello"));
    }
}