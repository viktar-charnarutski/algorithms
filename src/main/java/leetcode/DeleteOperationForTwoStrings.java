package leetcode;

/**
 * 583. Delete Operation for Two Strings
 * <p>
 * Given two words word1 and word2, find the minimum number of steps required to make word1 and word2 the same,
 * where in each step you can delete one character in either string.
 */
public class DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2) {
        return word1.length() + word2.length() - (2 * lengthOfCommonSubstr(word1, word2, 0, 0));
    }

    private int lengthOfCommonSubstr(String word1, String word2, int ind1, int ind2) {
        if (ind1 == word1.length() || ind2 == word2.length()) return 0;

        if (word1.charAt(ind1) == word2.charAt(ind2)) {
            return 1 + lengthOfCommonSubstr(word1, word2, ind1 + 1, ind2 + 1);
        }

        return Math.max(
                lengthOfCommonSubstr(word1, word2, ind1, ind2 + 1),
                lengthOfCommonSubstr(word1, word2, ind1 + 1, ind2));
    }
}
