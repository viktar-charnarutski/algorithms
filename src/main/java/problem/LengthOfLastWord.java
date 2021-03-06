package problem;

/**
 * 58. Length of Last Word
 * <p>
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int result = 0;
        int curLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result = curLength > 0 ? curLength : result;
                curLength = 0;
                continue;
            }
            curLength++;
        }
        return curLength > 0 ? curLength : result;
    }
}
