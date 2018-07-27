package problem;

import org.junit.Test;

import java.util.Arrays;

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
        assertTrue(new WordBreak().wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }
}