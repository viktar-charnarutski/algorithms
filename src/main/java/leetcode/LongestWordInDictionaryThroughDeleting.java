package leetcode;

import java.util.List;

/**
 * 524. Longest Word in Dictionary through Deleting
 */
public class LongestWordInDictionaryThroughDeleting {
    private static final int CHARS_COUNT = 26;

    public String findLongestWord(String s, List<String> d) {
        return null;
    }

    private boolean charMatch(String word, int[] target) {
        int[] chars = new int[CHARS_COUNT];
        for (char c : word.toCharArray()) {
            chars[c - 'a']++;
        }

        for (int i = 0; i < CHARS_COUNT; i++) {
            if (chars[i] < target[i]) return false;
        }

        return true;
    }
}
