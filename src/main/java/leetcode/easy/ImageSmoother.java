package leetcode.easy;

/**
 * 661. Image Smoother
 * <p>
 * Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother
 * to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding
 * cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.
 */
public class ImageSmoother {

    public int[][] imageSmoother(int[][] M) {
        if (M == null || (M.length == 1 && M[0].length == 1)) return M;
        int length = M.length;
        int width = M[0].length;

        int[][] res = new int[length][width];


        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {

                int sum = M[i][j];
                int count = 1;

                if (isValid(i - 1, j, length, width)) {
                    sum += M[i - 1][j];
                    count++;

                    if (isValid(i - 1, j - 1, length, width)) {
                        sum += M[i - 1][j - 1];
                        count++;
                    }

                    if (isValid(i - 1, j + 1, length, width)) {
                        sum += M[i - 1][j + 1];
                        count++;
                    }
                }

                if (isValid(i + 1, j, length, width)) {
                    sum += M[i + 1][j];
                    count++;

                    if (isValid(i + 1, j + 1, length, width)) {
                        sum += M[i + 1][j + 1];
                        count++;
                    }

                    if (isValid(i + 1, j - 1, length, width)) {
                        sum += M[i + 1][j - 1];
                        count++;
                    }
                }

                if (isValid(i, j + 1, length, width)) {
                    sum += M[i][j + 1];
                    count++;
                }

                if (isValid(i, j - 1, length, width)) {
                    sum += M[i][j - 1];
                    count++;
                }

                res[i][j] = (int) Math.floor(sum / count);
            }
        }
        return res;
    }

    private static boolean isValid(int i, int j, int length, int width) {
        return i >= 0 && j >= 0 && i < length && j < width;
    }
}
