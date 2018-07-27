package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordBreakTest {

    @Test
    public void wordBreak1() {
        assertTrue(new WordBreak().wordBreak("leetcode", Arrays.asList("leet", "code")));
    }

    @Test
    public void wordBreak2() {
        assertTrue(new WordBreak().wordBreak("applepenapple", Arrays.asList("apple", "pen")));
    }

    @Test
    public void wordBreak3() {
        assertFalse(new WordBreak().wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

    @Test
    public void wordBreak4() {
        assertTrue(new WordBreak().wordBreak("a", Arrays.asList("a")));
    }

    @Test
    public void wordBreak5() {
        assertTrue(new WordBreak().wordBreak("apple", Arrays.asList("apple", "pear", "peach")));
    }

    @Test
    public void wordBreak6() {
        assertFalse(new WordBreak().wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa")));
    }
}