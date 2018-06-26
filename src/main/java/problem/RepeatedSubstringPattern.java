package problem;

/**
 * 459. Repeated Substring Pattern
 * <p>
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies
 * of the substring together. You may assume the given string consists of lowercase English letters only and its length
 * will not exceed 10000.
 * Example 1:
 * Input: "abab"
 * <p>
 * Output: True
 * <p>
 * Explanation: It's the substring "ab" twice.
 * Example 2:
 * Input: "aba"
 * <p>
 * Output: False
 * Example 3:
 * Input: "abcabcabcabc"
 * <p>
 * Output: True
 * <p>
 * Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {

        for (int i = s.length() / 2; i > 0; i--) {

            if (s.length() % i == 0) {

                int repeatCount = s.length() / i;
                String repeatedSubstringPattern = s.substring(0, i);

                StringBuilder rebuiltString = new StringBuilder();
                for (int j = 0; j < repeatCount; j++) {
                    rebuiltString.append(repeatedSubstringPattern);
                }

                if (rebuiltString.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean repeatedSubstringPatternSlow(String s) {

        StringBuilder pattern = new StringBuilder();
        pattern.append(s.charAt(0));

        for (int i = 1; i <= s.length() / 2; i++) {

            if (s.charAt(i) == s.charAt(0)) {
                if (s.split(pattern.toString()).length == 0) {
                    return true;
                }
            }
            pattern.append(s.charAt(i));
        }

        return false;
    }
}
