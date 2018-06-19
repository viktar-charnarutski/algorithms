package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateLettersTest {

    @Test
    public void removeDuplicateLetters1() {
        assertEquals("abc", "bcabc");
    }

    @Test
    public void removeDuplicateLetters2() {
        assertEquals("acdb", "cbacdcbc");
    }
}