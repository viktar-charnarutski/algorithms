package problem;

import java.util.HashSet;
import java.util.Set;

/**
 * 567. Permutation in String
 * <p>
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
 * In other words, one of the first string's permutations is the substring of the second string.
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() == 0) return true;

        Set<Character> uniqChars = new HashSet<>();
        for (char c : s1.toCharArray()) uniqChars.add(c);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            if (!uniqChars.contains(s2.charAt(i))) continue;

            String window = s2.substring(i, i + s1.length());
            if (isPermutation(window, s1)) return true;
        }
        return false;
    }

    private boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            int[] s1CharsCount = countChars(s1);
            for (char c : s2.toCharArray()) {
                if (s1CharsCount[c - 'a']-- <= 0) return false;
            }
        }
        return true;
    }

    private int[] countChars(String s) {
        int[] charsCount = new int[26];
        for (char c : s.toCharArray()) {
            charsCount[c - 'a']++;
        }
        return charsCount;
    }
}
