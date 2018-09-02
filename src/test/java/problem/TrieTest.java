package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrieTest {

    @Test
    public void insert_and_search() {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("hw");
        assertTrue(trie.search("hello"));
        assertTrue(trie.search("hw"));
        assertFalse(trie.search("ello"));
        assertTrue(trie.startsWith("hell"));
        assertTrue(trie.startsWith("hel"));
        assertTrue(trie.startsWith("h"));
        assertFalse(trie.startsWith("ello"));
    }
}