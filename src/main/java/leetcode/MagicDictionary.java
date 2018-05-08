package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 676. Implement Magic Dictionary
 * <p>
 * Implement a magic directory with buildDict, and search methods.
 * <p>
 * For the method buildDict, you'll be given a list of non-repetitive words to build a dictionary.
 * <p>
 * For the method search, you'll be given a word, and judge whether if you modify exactly one character
 * into another character in this word, the modified word is in the dictionary you just built.
 */
class MagicDictionary {

    private HashMap<Integer, List<String>> map;
    /**
     * Initialize your data structure here.
     */
    public MagicDictionary() {
        map = new HashMap<>();
    }

    /**
     * Build a dictionary through a list of words
     */
    public void buildDict(String[] dict) {
        map.clear();
        for (String w : dict) {
            int l = w.length();
            if (!map.containsKey(l)) {
                map.put(l, new ArrayList<>());
            }
            map.get(l).add(w);
        }
    }

    /**
     * Returns if there is any word in the trie that equals to the given word after modifying exactly one character
     */
    public boolean search(String word) {
        int l = word.length();
        if (!map.containsKey(l)) return false;

        List<String> words = map.get(l);
        for (String w : words) {
            if (oneLetterDiff(w, word)) return true;
        }

        return false;
    }

    private boolean oneLetterDiff(String first, String second) {
        boolean diff = false;
        int ind = 0;
        while (ind < first.length()) {
            if (first.charAt(ind) != second.charAt(ind)) {
                if (diff) return false;
                diff = true;
            }
            ind++;
        }

        return diff;
    }
}