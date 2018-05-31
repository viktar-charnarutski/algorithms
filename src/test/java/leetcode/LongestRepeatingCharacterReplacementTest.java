package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestRepeatingCharacterReplacementTest {

    @Test
    public void characterReplacement1() {
        assertEquals(4, new LongestRepeatingCharacterReplacement().characterReplacement("ABAB", 2));
    }

    @Test
    public void characterReplacement2() {
        assertEquals(4, new LongestRepeatingCharacterReplacement().characterReplacement("AABABBA", 1));
    }
}