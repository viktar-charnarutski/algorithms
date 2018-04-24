package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordPatternTest {

    @Test
    public void wordPattern_true() {
        WordPattern ins = new WordPattern();
        assertTrue(ins.wordPattern("abba", "dog cat cat dog"));
    }
    @Test
    public void wordPattern_false() {
        WordPattern ins = new WordPattern();
        assertFalse(ins.wordPattern("abba", "dog cat cat fish"));
        assertFalse(ins.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(ins.wordPattern("abba", "dog dog dog dog"));
    }
}