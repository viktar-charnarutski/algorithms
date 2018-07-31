package problem;

/**
 * 859. Buddy Strings
 * <p>
 * Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the
 * result equals B.
 */
public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;

        // edge case handling: A == B:
        // if 2 input strings are equal,
        // char sequence of such string
        // should has at least one repeated
        // char
        if (A.equals(B)) {
            int[] dict = new int[26];
            for (int i = 0; i < A.length(); i++) {
                int ind = A.charAt(i) - 'a';
                if (dict[ind]++ > 0) return true;
            }
            return false;
        }

        int diffInd = -1;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (diffInd == -1) {
                    diffInd = i;
                } else {
                    return B.charAt(i) == A.charAt(diffInd) && A.charAt(i) == B.charAt(diffInd);
                }
            }
        }
        return false;
    }
}
