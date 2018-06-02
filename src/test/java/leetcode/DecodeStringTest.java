package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeStringTest {

    @Test
    public void decodeString1() {
        assertEquals("aaabcbc", new DecodeString().decodeString("3[a]2[bc]"));
    }

    @Test
    public void decodeString2() {
        assertEquals("accaccacc", new DecodeString().decodeString("3[a2[c]]"));
    }

    @Test
    public void decodeString3() {
        assertEquals("abcabccdcdcdef", new DecodeString().decodeString("2[abc]3[cd]ef"));
    }
}