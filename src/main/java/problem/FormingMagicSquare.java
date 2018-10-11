package problem;

/**
 * Forming a Magic Square
 * <p>
 * We define a magic square to be an NxN matrix of distinct positive integers from 1 to 9 where the sum of any row,
 * column, or diagonal of length N is always equal to the same number: the magic constant.
 * <p>
 * You will be given a 3x3 matrix s of integers in the inclusive range [1, 9]. We can convert any digit a to any other
 * digit b in the range [1, 9] at cost of |a - b|. Given s, convert it into a magic square at minimal cost.
 * Print this cost on a new line.
 * <p>
 * Note: The resulting magic square must contain distinct integers in the inclusive range [1, 9].
 */
public class FormingMagicSquare {
    static int formingMagicSquare(int[][] s) {
        int[][][] variants = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}};

        int minDiff = Integer.MAX_VALUE;
        for (int[][] variant : variants) {
            minDiff = Math.min(diff(variant, s), minDiff);
        }
        return minDiff;
    }

    static int diff(int[][] magicMatrix, int[][] currentMatrix) {
        int diff = 0;
        for (int row = 0; row < magicMatrix.length; row++) {
            for (int col = 0; col < magicMatrix[0].length; col++) {
                diff += Math.abs(magicMatrix[row][col] - currentMatrix[row][col]);
            }
        }
        return diff;
    }
}
