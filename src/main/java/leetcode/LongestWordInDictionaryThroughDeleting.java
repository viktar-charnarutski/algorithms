package leetcode;

import java.util.List;

/**
 * 524. Longest Word in Dictionary through Deleting
 *
 * Given a string and a string dictionary, find the longest string in the dictionary that can be formed
 * by deleting some characters of the given string. If there are more than one possible results,
 * return the longest word with the smallest lexicographical order. If there is no possible result,
 * return the empty string.
 */
public class LongestWordInDictionaryThroughDeleting {

    private static final int CHARS_COUNT = 26;

    public String findLongestWord(String s, List<String> d) {
        String res = "";
        int[] target = occurrence(s);
        for (String str : d) {
            if (check(str, target)) {
                res = str.length() > res.length() ? str : res;
            }
        }
        return res;
    }

    private int[] occurrence(String str) {
        int[] chars = new int[CHARS_COUNT];
        for (char c : str.toCharArray()) {
            chars[c - 'a']++;
        }
        return chars;
    }

    private boolean check(String word, int[] target) {
        int[] chars = occurrence(word);
        for (int i = 0; i < CHARS_COUNT; i++) {
            if (chars[i] < target[i]) return false;
        }
        return true;
    }
}
