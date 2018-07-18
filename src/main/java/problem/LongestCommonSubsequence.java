package problem;

/**
 * Longest Common Subsequence
 * <p>
 * Given two sequences, find the length of longest subsequence present in both of them.
 * <p>
 * A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.
 * For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
 * <p>
 * So a string of length n has 2^n different possible subsequences.
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String strA, String strB) {
        return check(strA, strB, strA.length() - 1, strB.length() - 1);
    }

    private static int check(String strA, String strB, int indA, int indB) {
        if (indA < 0 || indB < 0) return 0;
        if (strA.charAt(indA) == strB.charAt(indB)) {
            return 1 + check(strA, strB, indA - 1, indB - 1);
        }
        return Math.max(check(strA, strB, indA, indB - 1), check(strA, strB, indA - 1, indB));
    }
}
