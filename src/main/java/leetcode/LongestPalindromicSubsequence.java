package leetcode;

/**
 * 516. Longest Palindromic Subsequence
 * <p>
 * Given a string s, find the longest palindromic subsequence's length in s.
 * You may assume that the maximum length of s is 1000.
 */
public class LongestPalindromicSubsequence {

    public int longestPalindromeSubseq(String s) {
        return checkPalindromeSubseq(s, 0, s.length() - 1, new Integer[s.length()][s.length()]);
    }

    // bbbab
    private int checkPalindromeSubseq(String s, int left, int right, Integer[][] memo) {
        if (memo[left][right] != null) return memo[left][right];

        if (left > right) return 0;
        if (left == right) return 1;

        if (s.charAt(left) == s.charAt(right)) {
            memo[left][right] = checkPalindromeSubseq(s, left + 1, right - 1, memo) + 2;
        } else {
            memo[left][right] = Math.max(checkPalindromeSubseq(s, left, right - 1, memo),
                    checkPalindromeSubseq(s, left + 1, right, memo));
        }
        return memo[left][right];
    }
}
