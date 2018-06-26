package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateLettersTest {

    @Test
    public void removeDuplicateLetters1() {
        assertEquals("abc", new RemoveDuplicateLetters().removeDuplicateLetters("bcabc"));
    }

    @Test
    public void removeDuplicateLetters2() {
        assertEquals("acdb", new RemoveDuplicateLetters().removeDuplicateLetters("cbacdcbc"));
    }
}