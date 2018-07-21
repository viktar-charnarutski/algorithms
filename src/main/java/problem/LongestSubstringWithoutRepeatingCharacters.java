package problem;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * <p>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke"
 * is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        if (s.length() == 1) return 1;
        int maxLength = 0, start = 0, end = 0;

        HashSet<Character> uniqChars = new HashSet<>();
        while (end < s.length()) {
            if (!uniqChars.contains(s.charAt(end))) {
                uniqChars.add(s.charAt(end));
                end++;
                maxLength = Math.max(uniqChars.size(), maxLength);
            } else {
                uniqChars.remove(s.charAt(start++));
            }
        }

        return maxLength;
    }

    public int lengthOfLongestSubstringBruteForce(String s) {
        if (s == null || s.isEmpty()) return 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> uniqCharsSet = new HashSet<>();
            int currLength = 0;
            for (int j = i; j < s.length(); j++) {
                if (!uniqCharsSet.add(s.charAt(j))) {
                    break;
                }
                currLength++;
            }
            maxLength = Math.max(currLength, maxLength);
        }
        return maxLength;
    }
}
