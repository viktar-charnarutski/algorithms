package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class ReverseVowelsOfStringTest {

    @Test
    public void reverseVowels() {
        ReverseVowelsOfString ins = new ReverseVowelsOfString();

        assertEquals("holle", ins.reverseVowels("hello"));
        assertEquals("leotcede", ins.reverseVowels("leetcode"));
    }
}