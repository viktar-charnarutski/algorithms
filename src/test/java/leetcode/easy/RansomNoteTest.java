package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class RansomNoteTest {

    @Test
    public void canConstruct() {
        RansomNote ransomNote = new RansomNote();
        assertTrue(ransomNote.canConstruct("aa", "aab"));
        assertFalse(ransomNote.canConstruct("aa", "ab"));
        assertFalse(ransomNote.canConstruct("a", "b"));
        assertTrue(ransomNote.canConstruct("", "b"));
        assertFalse(ransomNote.canConstruct("a", ""));
    }
}