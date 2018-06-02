package leetcode;

import java.util.Stack;

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
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> reps = new Stack<>();
        Stack<String> strs = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int d = 0;
                while (Character.isDigit(s.charAt(i))) {
                    d = d * 10 + Character.getNumericValue(s.charAt(i));
                    i++;
                }
                reps.push(d);
            } else if (s.charAt(i) == '[') {
                strs.push(res.toString());
                res.setLength(0);
                i++;
            } else if (s.charAt(i) == ']') {
                StringBuilder sb = new StringBuilder(strs.pop());
                int rep = reps.pop();
                for (int j = 0; j < rep; j++) {
                    sb.append(res);
                }
                res = sb;
                i++;
            } else {
                res.append(s.charAt(i++));
            }
        }
        return res.toString();
    }
}
