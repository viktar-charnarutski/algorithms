package problem;

/**
 * Edit Distance
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
    public int editDistance(String str1, String str2) {
        return count(str1, str2, 0, 0);
    }

    private int count(String str1, String str2, int i1, int i2) {
        if (i1 == str1.length()) {
            return str2.length() - i2;
        }
        if (i2 == str2.length()) {
            return str1.length() - i1;
        }

        if (str1.charAt(i1) == str2.charAt(i2)) {
            return count(str1, str2, i1 + 1, i2 + 1);
        }

        return Math.min(count(str1, str2, i1 + 1, i2 + 1) + 1,
                Math.min(count(str1, str2, i1 + 1, i2) + 1, count(str1, str2, i1, i2 + 1) + 1));
    }
}
