package problem;

/**
 * 557. Reverse Words in a String III
 * <p>
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class ReverseWordsInAStringIII {

    private static final String DELIMITER = " ";

    public String reverseWords(String s) {

        if (s == null || s.length() <= 1) return s;

        String[] words = s.split(DELIMITER);
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(revertString(word)).append(DELIMITER);
        }
        return result.toString().trim();
    }

    private String revertString(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
