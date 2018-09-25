package problem;

import java.util.Arrays;

/**
 * 72. Edit Distance
 * <p>
 * Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.
 * <p>
 * - Insert
 * - Remove
 * - Replace
 * <p>
 * All of the above operations are of equal cost.
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        if (word1 == null) return word2.length();
        if (word2 == null) return word1.length();
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= word2.length(); i++) {
            dp[0][i] = i;
        }
        for (int row = 1; row < dp.length; row++) {
            for (int col = 1; col < dp[0].length; col++) {
                if (word1.charAt(row - 1) == word2.charAt(col - 1)) {
                    dp[row][col] = dp[row - 1][col - 1];
                } else {
                    dp[row][col] = 1 + Math.min(dp[row - 1][col - 1], Math.min(dp[row - 1][col], dp[row][col - 1]));
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
