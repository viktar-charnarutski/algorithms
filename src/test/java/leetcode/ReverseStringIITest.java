package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class ReverseStringIITest {

    @Test
    public void reverseStr() {
        ReverseStringII ins = new ReverseStringII();

        assertEquals("bacdfeg", ins.reverseStr("abcdefg", 2));
        assertEquals("a", ins.reverseStr("a", 2));
    }
}