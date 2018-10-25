package problem;

/**
 * 926. Flip String to Monotone Increasing
 * <p>
 * A string of '0's and '1's is monotone increasing if it consists of some number of '0's (possibly 0), followed by
 * some number of '1's (also possibly 0.)
 * <p>
 * We are given a string S of '0's and '1's, and we may flip any '0' to a '1' or a '1' to a '0'.
 * <p>
 * Return the minimum number of flips to make S monotone increasing.
 */
public class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String S) {
        int flipsCount = 0, onesCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                if (onesCount > 0) {
                    flipsCount++;
                }
            } else {
                onesCount++;
            }

            if (flipsCount > onesCount) {
                flipsCount = onesCount;
            }
        }
        return flipsCount;
    }
}
