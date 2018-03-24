package strings.easy;

/**
 * 344. Reverse String
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {
    public String reverseString(String s) {
        if (s == null || s.length() <= 1) return s;

        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
