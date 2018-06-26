package problem;

import java.util.HashSet;
import java.util.List;

/**
 * 648. Replace Words
 * <p>
 * In English, we have a concept called root, which can be followed by some other words to form another longer word -
 * let's call this word successor. For example, the root an, followed by other, which can form another word another.
 * <p>
 * Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor
 * in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with
 * the shortest length.
 * <p>
 * You need to output the sentence after the replacement.
 */
public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        TrieNode trie = buildTrie(dict);
        String[] words = sentence.split("\\s+");
        return replaceWords(words, trie);
    }

    private String replaceWords(String[] words, TrieNode trie) {
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(getRoot(w, trie)).append(" ");
        }
        return sb.toString().trim();
    }

    private String getRoot(String word, TrieNode trie) {
        TrieNode tmp = trie;
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append(c);
            TrieNode child = tmp.children[c - 'a'];
            if (child != null) {
                if (child.isWorld)
                    return sb.toString();
            } else {
                break;
            }
            tmp = child;
        }
        return word;
    }

    private TrieNode buildTrie(List<String> dict) {
        TrieNode root = new TrieNode(' ');
        for (String w : dict) {
            TrieNode tmp = root;
            for (char c : w.toCharArray()) {
                if (tmp.children[c - 'a'] == null) {
                    tmp.children[c - 'a'] = new TrieNode(c);
                }
                tmp = tmp.children[c - 'a'];
            }
            tmp.isWorld = true;
        }
        return root;
    }

    private class TrieNode {
        char val;
        TrieNode[] children;
        boolean isWorld;

        TrieNode(char val) {
            this.val = val;
            this.children = new TrieNode[26];
            this.isWorld = false;
        }
    }

    public String replaceWordsString(List<String> dict, String sentence) {
        HashSet<String> set = new HashSet<>(dict);
        StringBuilder sb = new StringBuilder();

        for (String w : sentence.split(" ")) {
            int i = 1;
            while (i < w.length()) {
                String root = w.substring(0, i++);
                if (set.contains(root)) {
                    w = root;
                    break;
                }
            }
            sb.append(w).append(" ");
        }
        return sb.toString().trim();
    }
}
