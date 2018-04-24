package leetcode.easy;

import java.util.HashMap;

/**
 * 290. Word Pattern
 * <p>
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between
 * a letter in pattern and a non-empty word in str.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null) return false;
        else if (pattern.isEmpty() && str.isEmpty()) return true;

        String[] words = str.split(" ");
        if (words.length != pattern.length()) return false;

        HashMap<Character, String> patternMapping = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            String currStr = patternMapping.get(pattern.charAt(i));
            if (currStr == null) {
                if (patternMapping.containsValue(words[i])) return false;
                patternMapping.put(pattern.charAt(i), words[i]);
            } else {
                if (!currStr.equals(words[i])) return false;
            }
        }
        return true;
    }
}
