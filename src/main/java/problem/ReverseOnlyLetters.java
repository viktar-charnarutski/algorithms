package problem;

/**
 * 917. Reverse Only Letters
 *
 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and
 * all letters reverse their positions.
 */
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int start = 0, end = S.length() - 1;
        while (start < end) {
            while (start < end && !Character.isLetter(chars[start])) {
                start++;
            }
            while (start < end && !Character.isLetter(chars[end])) {
                end--;
            }
            char c = chars[start];
            chars[start] = chars[end];
            chars[end] = c;

            start++;
            end--;
        }
        return new String(chars);
    }
}
