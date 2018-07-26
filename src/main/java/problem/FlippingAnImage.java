package problem;

/**
 * 832. Flipping an Image
 *
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0]
 * horizontally results in [0, 1, 1].
 *
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1]
 * results in [1, 0, 0].
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null || A.length == 0) return A;
        flipHorizontally(A);
        invert(A);
        return A;
    }

    void invert(int[][] grid) {
        for (int[] row : grid) {
            for (int i = 0; i < row.length; i++) {
                row[i] = row[i] == 0 ? 1 : 0;
            }
        }
    }

    void flipHorizontally(int[][] grid) {
        for (int[] row : grid) {
            for (int i = 0; i < row.length / 2; i++) {
                int tmp = row[i];
                row[i] = row[row.length - 1 - i];
                row[row.length - 1 - i] = tmp;
            }
        }
    }
}
