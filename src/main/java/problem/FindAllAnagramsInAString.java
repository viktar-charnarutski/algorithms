package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 438. Find All Anagrams in a String
 * <p>
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * <p>
 * Strings consists of lowercase English letters only and the length of both strings s and p w
 * ill not be larger than 20,100.
 * <p>
 * The order of output does not matter.
 */
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        if (s == null || p == null || p.length() > s.length()) return Collections.emptyList();

        List<Integer> resList = new ArrayList<>();

        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (isAnagram(s.substring(i, i + p.length()), p)) {
                resList.add(i);
            }
        }

        return resList;
    }

    private static boolean isAnagram(String str, String p) {
        int[] chars = new int[28];
        for (char c : p.toCharArray()) {
            chars[c - 'a']++;
        }

        for (char c : str.toCharArray()) {
            if (chars[c - 'a'] == 0) return false;
            chars[c - 'a']--;
        }

        return true;
    }
}
