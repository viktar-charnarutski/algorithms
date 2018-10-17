package problem;

/**
 * The Grid Search.
 * <p>
 * Given a 2D array of digits or grid, try to find the occurrence of a given 2D pattern of digits. For example,
 * consider the following grid:
 * <p>
 * 1234567890
 * 0987654321
 * 1111111111
 * 1111111111
 * 2222222222
 * <p>
 * Assume we need to look for the following 2D pattern array:
 * <p>
 * 876543
 * 111111
 * 111111
 * <p>
 * The 2D pattern begins at the second row and the third column of the grid. The pattern is said to be present in the
 * grid.
 */
public class TheGridSearch {
    static String gridSearch(String[] G, String[] P) {
        for (int row = 0; row < G.length; row++) {
            for (int charIndex = 0; charIndex < G[0].length(); charIndex++) {
                if (isPattern(row, charIndex, G, P)) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    private static boolean isPattern(int row, int charIndexStart, String[] G, String[] P) {
        if (G[row].length() - charIndexStart < P[0].length()) {
            return false;
        }
        for (int i = 0; i < P.length; i++) {
            if (!P[i].equals(G[row + i].substring(charIndexStart, charIndexStart + P[0].length()))) {
                return false;
            }
        }
        return true;
    }
}
