package problem;

import java.util.HashSet;

/**
 * 76. Minimum Window Substring
 * <p>
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T.
 *
 * Note:
 * - If there is no such window in S that covers all characters in T, return the empty string "".
 * - If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
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
        for(char c : str.toCharArray()) {
            strUniqChars.add(c);
        }
        for (char c : alph.toCharArray()) {
            if (!strUniqChars.contains(c)) return false;
        }
        return true;
    }
}
