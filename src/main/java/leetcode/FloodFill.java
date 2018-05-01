package leetcode;

/**
 * 733. Flood Fill
 * <p>
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image
 * (from 0 to 65535).
 * <p>
 * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill,
 * and a pixel value newColor, "flood fill" the image.
 * <p>
 * To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally
 * to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally
 * to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of
 * the aforementioned pixels with the newColor.
 * <p>
 * At the end, return the modified image.
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        floodFill(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    private static void floodFill(int[][] image, int sr, int sc, int newColor, int oldColor) {
        if (sr < image.length && sr >= 0 && sc < image[0].length && sc >= 0 &&
                image[sr][sc] == oldColor && image[sr][sc] != newColor) {
            image[sr][sc] = newColor;
            floodFill(image, sr - 1, sc, newColor, oldColor);
            floodFill(image, sr + 1, sc, newColor, oldColor);
            floodFill(image, sr, sc - 1, newColor, oldColor);
            floodFill(image, sr, sc + 1, newColor, oldColor);
        }
    }
}
