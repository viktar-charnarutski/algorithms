package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntroductiontoTriesTest {

    @Test
    public void insert_and_search() {
        IntroductiontoTries.Trie trie = new IntroductiontoTries().new Trie();
        trie.insertWord("hello");
        trie.insertWord("hw");
        assertTrue(trie.searchWord("hello"));
        assertTrue(trie.searchWord("hw"));
        assertFalse(trie.searchWord("ello"));
        assertTrue(trie.searchPrefix("hell"));
        assertTrue(trie.searchPrefix("hel"));
        assertTrue(trie.searchPrefix("h"));
        assertFalse(trie.searchPrefix("ello"));
    }
}