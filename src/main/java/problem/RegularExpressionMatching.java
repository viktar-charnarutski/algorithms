package problem;

/**
 * 10. Regular Expression Matching
 * <p>
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 * <p>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * <p>
 * Note:
 * <p>
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like . or *.
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        return isMatch(s, p, 0, 0);
    }

    private boolean isMatch(String s, String p, int si, int pi) {
        if (si >= s.length()) {
            if (pi >= p.length()) {
                return true;
            } else {
                if (pi + 1 < p.length() && p.charAt(pi + 1) == '*') {
                    return isMatch(s, p, si, pi + 2);
                } else {
                    return false;
                }
            }
        } else if (pi >= p.length()) {
            return false;
        }

        // abc, ab*c || abcd, ab*xcd
        if (pi + 1 < p.length() && p.charAt(pi + 1) == '*') {
            if (p.charAt(pi) == '.' || s.charAt(si) == p.charAt(pi)) {
                return isMatch(s, p, si, pi + 2) || isMatch(s, p, si + 1, pi);
            } else {
                return isMatch(s, p, si, pi + 2);
            }
        }

        // abc, abc || abc, a.c
        if (s.charAt(si) == p.charAt(pi) || p.charAt(pi) == '.' || p.charAt(pi) == '*') {
            return isMatch(s, p, si + 1, pi + 1);
        }

        return false;
    }
}
