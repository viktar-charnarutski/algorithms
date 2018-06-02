package leetcode;

/**
 * 394. Decode String
 * <p>
 * Given an encoded string, return it's decoded string.
 * <p>
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated
 * exactly k times. Note that k is guaranteed to be a positive integer.
 * <p>
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 * <p>
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only
 * for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 */
public class DecodeString {
    // 3[a]2[bc] --> aaabcbc
    // 3[a2[c]]  --> accaccacc
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int i = 1;
        while (i < s.length()) {
            if (s.charAt(i) == '[') {
                StringBuilder sb = new StringBuilder();
                int n = Character.getNumericValue(s.charAt(i - 1));
                int k = i + 1;
                while (s.charAt(k) != ']') {
                    sb.append(s.charAt(k++));
                }
                for (int j = 0; j < n; j++) {
                    res.append(sb);
                }
                i = k;
            }
            i++;
        }
        return res.toString();
    }
}
