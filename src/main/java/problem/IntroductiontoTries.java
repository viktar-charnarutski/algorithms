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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TrieNode)) return false;

            TrieNode trieNode = (TrieNode) o;

            if (c != null ? !c.equals(trieNode.c) : trieNode.c != null) return false;
            if (isLeaf != null ? !isLeaf.equals(trieNode.isLeaf) : trieNode.isLeaf != null) return false;
            return children != null ? children.equals(trieNode.children) : trieNode.children == null;
        }

        @Override
        public int hashCode() {
            int result = c != null ? c.hashCode() : 0;
            result = 31 * result + (isLeaf != null ? isLeaf.hashCode() : 0);
            result = 31 * result + (children != null ? children.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "TrieNode{" +
                    "c=" + c +
                    ", children=" + children +
                    '}';
        }
    }

    class Trie {
        private TrieNode root;

        // Implement these methods :
        public Trie() {
            root = new TrieNode(' ');
        }

        public void insertWord(String word) {
            if (word == null || word.length() == 0) {
                return;
            }
            insertWord(word, this.root);
        }

        private void insertWord(String word, TrieNode node) {
            if (word.length() == 0) {
                return;
            }
            char c = word.charAt(0);
            // first word's char is the current root's one
            // so just check the next word's char
            if (node.c.equals(c)) {
                insertWord(word.substring(1, word.length()), this.root);
                return;
            }
            // first word's char is known as the current node's child
            // so get an appropriate trie and go with the remained word's chars
            if (node.children.containsKey(c)) {
                insertWord(word.substring(1, word.length()), node.children.get(c));
            } else {
                // otherwise create a new chain of tries for the word
                // and add it to the root's children
                TrieNode curr = new TrieNode(c);
                if(word.length() > 1) {
                    populateTrie(curr, word.substring(1, word.length()));
                } else {
                    curr.isLeaf = true;
                }
                node.children.put(c, curr);
            }
        }

        private void populateTrie(TrieNode node, String word) {
            if (word.length() == 0) {
                return;
            }
            TrieNode prev = node, curr = null;
            for (char c : word.toCharArray()) {
                curr = new TrieNode(c);
                prev.children.put(c, curr);
                prev = curr;
            }
            curr.isLeaf = true;
        }

        public Boolean searchWord(String word) {
            if (word.length() == 0) {
                return true;
            }
            return searchWord(word, this.root.children.get(word.charAt(0)));
        }

        private boolean searchWord(String word, TrieNode node) {
            if (word.length() == 0 || node == null) {
                return false;
            }
            char c = word.charAt(0);
            if (word.length() == 1) {
                return node.c.equals(c) && node.isLeaf;
            }
            return node.c.equals(c)
                    && searchWord(word.substring(1, word.length()), node.children.get(word.charAt(1)));
        }

        public Boolean searchPrefix(String word) {
            return searchPrefix(word, this.root.children.get(word.charAt(0)));
        }

        private boolean searchPrefix(String word, TrieNode node) {
            if (word.length() == 0 || node == null) {
                return false;
            }
            char c = word.charAt(0);
            if (word.length() == 1) {
                return node.c.equals(c);
            }
            return node.c.equals(c)
                    && searchPrefix(word.substring(1, word.length()), node.children.get(word.charAt(1)));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Trie)) return false;

            Trie trie = (Trie) o;

            return root != null ? root.equals(trie.root) : trie.root == null;
        }

        @Override
        public int hashCode() {
            return root != null ? root.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Trie{" +
                    "root=" + root +
                    '}';
        }
    }
}















