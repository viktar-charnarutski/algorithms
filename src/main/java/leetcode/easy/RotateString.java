package leetcode.easy;

/**
 * 796. Rotate String
 * <p>
 * We are given two strings, A and B.
 * <p>
 * A shift on A consists of taking string A and moving the leftmost character to the rightmost position.
 * For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B
 * after some number of shifts on A.
 */
public class RotateString {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }

    public boolean rotateStringSlow(String A, String B) {
        if (A.isEmpty() && B.isEmpty()) return true;

        StringBuilder sb = new StringBuilder(A);
        for (char c : A.toCharArray()) {
            sb.deleteCharAt(0).append(c);
            if (sb.toString().equals(B))
                return true;
        }
        return false;
    }
}
