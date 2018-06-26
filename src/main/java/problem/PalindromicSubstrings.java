package problem;

/**
 * 647. Palindromic Substrings
 * <p>
 * Given a string, your task is to count how many palindromic substrings in this string.
 * <p>
 * The substrings with different start indexes or end indexes are counted as different
 * substrings even they consist of same characters.
 */
public class PalindromicSubstrings {
    private int count = 0;

    public int countSubstrings(String s) {

        for (int i = 0; i < s.length(); i++) {
            checkPalindrome(s, i, i);
            checkPalindrome(s, i, i + 1);
        }
        return count;
    }

    private void checkPalindrome(String s, int left, int right) {
        if (left < 0 || right >= s.length()) return;

        if (s.charAt(left) == s.charAt(right)) {
            count++;
            checkPalindrome(s, left - 1, right + 1);
        }
    }
}
