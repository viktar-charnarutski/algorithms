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

        // edge case handling: A == B
        if (A.equals(B)) {
            for (int i = 1; i < A.length(); i++) {
                if (A.charAt(i) == A.charAt(i - 1)) {
                    return true;
                }
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
