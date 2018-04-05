package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord() {
        LengthOfLastWord ins = new LengthOfLastWord();

        assertTrue(5 == ins.lengthOfLastWord("Hello World"));
        assertTrue(5 == ins.lengthOfLastWord("Hello World     "));
        assertTrue(1 == ins.lengthOfLastWord("a"));
        assertTrue(0 == ins.lengthOfLastWord(""));
        assertTrue(0 == ins.lengthOfLastWord("       "));
        assertTrue(3 == ins.lengthOfLastWord("Today is a nice day"));
    }
}