package leetcode.easy;

/**
 * 409. Longest Palindrome
 * <p>
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * <p>
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * <p>
 * Note:
 * Assume the length of given string will not exceed 1,010.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() < 1) return 0;
        int result = 0;

        int[] letters = new int[126];

        for (char c : s.toCharArray()) {
            letters[c]++;
        }

        for (int i : letters) {
            result += (i / 2) * 2;
        }
        return result == s.length() ? result : ++result;
    }
}
