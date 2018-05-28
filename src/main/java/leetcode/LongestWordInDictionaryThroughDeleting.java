package leetcode;

import java.util.List;

/**
 * 524. Longest Word in Dictionary through Deleting
 * <p>
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
            int[] curr = occurrence(str);
            if (check(curr, target)) {
                if (str.length() > res.length()) {
                    res = str;
                } else if (str.length() == res.length()) {
                    res = smallestLexicoOrder(str, res);
                }
            }
        }
        return res;
    }

    String smallestLexicoOrder(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) < str2.charAt(i)) return str1;
            if (str1.charAt(i) > str2.charAt(i)) return str2;
        }
        return str1;
    }

    int[] occurrence(String str) {
        int[] chars = new int[CHARS_COUNT];
        for (char c : str.toCharArray()) {
            chars[c - 'a']++;
        }
        return chars;
    }

    boolean check(int[] curr, int[] target) {
        for (int i = 0; i < CHARS_COUNT; i++) {
            if (target[i] < curr[i]) return false;
        }
        return true;
    }
}
