package problem;

import java.util.HashMap;

/**
 * Introduction to Tries.
 * <p>
 * A Trie or Prefix Tree an efficient data lookup structure - often used to store large collections of words or
 * dictionaries. With a Trie, search complexities can be reduced to O(k) where k is the key or word length.
 * <p>
 * The autocorrect on your iOS or Android keyboard uses a Trie of the most commonly used words along with fuzzy match
 * algorithms to autocorrect and autosuggest words as you type. You're given a completed TrieNode class that represents
 * one node of a Trie, and a partially complete Trie class. Your task is to complete the insertWord, searchWord and
 * searchPrefix methods on the Trie class. Take a look at the examples below to see what each of these do.
 */
public class IntroductiontoTries {
    class TrieNode {
        Character c;
        Boolean isLeaf = false;
        HashMap<Character, TrieNode> children = new HashMap<>();

        public TrieNode() {
        }

        public TrieNode(Character c) {
            this.c = c;
        }
    }

    class Trie {
        private TrieNode root;

        // Implement these methods :
        public Trie() {
        }

        public void insertWord(String word) {
        }

        private void insertWord(String word, TrieNode node) {
        }

        public Boolean searchWord(String word) {
            return false;
        }

        public Boolean searchPrefix(String word) {
            return false;
        }
    }
}
