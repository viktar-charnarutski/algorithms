package problem;

/**
 * 161. One Edit Distance
 * <p>
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 */
public class OneEditDistance {
    public boolean isOneEditDistance(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) return false;

        int i1 = 0, i2 = 0, count = 0;
        while (i1 < s1.length() && i2 < s2.length()) {
            if (s1.charAt(i1) == s2.charAt(i2)) {
                i1++;
                i2++;
            } else {
                if (++count > 1) return false;
                if (s1.length() > s2.length()) {
                    i1++;
                } else if (s2.length() > s1.length()) {
                    i2++;
                } else {
                    i1++;
                    i2++;
                }
            }
        }
        return true;
    }
}