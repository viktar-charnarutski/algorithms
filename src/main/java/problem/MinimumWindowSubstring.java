package problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 76. Minimum Window Substring
 * <p>
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T.
 * <p>
 * Note:
 * - If there is no such window in S that covers all characters in T, return the empty string "".
 * - If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        String result = "";
        if (s == null || t == null) {
            return result;
        }

        Map<Character, Integer> alphabet = new HashMap<>();
        for (char c : t.toCharArray()) {
            alphabet.put(c, alphabet.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int alphabetCharsCount = t.length();
        for (int end = 0; end < s.length(); end++) {
            char currChar = s.charAt(end);
            if (alphabet.containsKey(currChar)) {
                int currCharCount = alphabet.get(currChar);
                if (currCharCount > 0) {
                    alphabetCharsCount--;
                }
                alphabet.put(currChar, currCharCount - 1);
            }

            if (alphabetCharsCount == 0) {
                start = shrinkWindow(alphabet, s, start, end);
                String candidate = s.substring(start, end + 1);
                result = result == null || result.length() == 0 || result.length() > candidate.length() ? candidate : result;
            }
        }
        return result;
    }

    private int shrinkWindow(Map<Character, Integer> alphabet, String str, int start, int end) {
        while (start < end) {
            char c = str.charAt(start);
            if (alphabet.containsKey(c)) {
                if (alphabet.get(c) < 0) {
                    alphabet.put(c, alphabet.get(c) + 1);
                } else {
                    return start;
                }
            }
            start++;
        }
        return start;
    }

    public String minWindowBruteForce(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }
        String minSubstr = null;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String potentialStr = s.substring(j, s.length());
                if (hasAllLetters(potentialStr, t) && isLengthLess(minSubstr, potentialStr)) {
                    minSubstr = potentialStr;
                }
            }
        }
        return minSubstr == null ? "" : minSubstr;
    }

    private boolean isLengthLess(String minSubstr, String potentialStr) {
        return minSubstr == null || potentialStr.length() < minSubstr.length();
    }

    private boolean hasAllLetters(String str, String alph) {
        HashSet<Character> strUniqChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            strUniqChars.add(c);
        }
        for (char c : alph.toCharArray()) {
            if (!strUniqChars.contains(c)) return false;
        }
        return true;
    }
}
