package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 208. Implement Trie (Prefix Tree)
 * <p>
 * A Trie or Prefix Tree an efficient data lookup structure - often used to store large collections of words or
 * dictionaries. With a Trie, search complexities can be reduced to O(k) where k is the key or word length.
 * <p>
 * The autocorrect on your iOS or Android keyboard uses a Trie of the most commonly used words along with fuzzy match
 * algorithms to autocorrect and autosuggest words as you type. You're given a completed TrieNode class that represents
 * one node of a Trie, and a partially complete Trie class. Your task is to complete the insertWord, searchWord and
 * searchPrefix methods on the Trie class. Take a look at the examples below to see what each of these do.
 */
public class Trie {
    private class TrieNode {
        private final char c;
        private final Map<Character, TrieNode> children;
        private boolean isWord;

        public TrieNode(char c) {
            this.c = c;
            this.children = new HashMap<>();
        }

        public boolean isWord() {
            return isWord;
        }

        public void markAsWord() {
            isWord = true;
        }

        public void addChild(TrieNode node) {
            children.put(node.c, node);
        }

        public boolean hasChild(char c) {
            return children.containsKey(c);
        }

        public TrieNode child(char c) {
            return children.get(c);
        }
    }

    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode(' ');
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word == null || word.length() == 0) {
            return;
        }
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (curr.hasChild(c)) {
                curr = curr.child(c);
            } else {
                TrieNode newNode = new TrieNode(c);
                curr.addChild(newNode);
                curr = newNode;
            }
        }
        curr.markAsWord();
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        if (word == null || word.length() == 0) {
            return true;
        }
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (!curr.hasChild(c)) {
                return false;
            }
            curr = curr.child(c);
        }
        return curr.isWord();
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.length() == 0) {
            return true;
        }
        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            if (!curr.hasChild(c)) {
                return false;
            }
            curr = curr.child(c);
        }
        return true;
    }
}















