package leetcode;

import java.util.Arrays;

/**
 * 593. Valid Square
 * <p>
 * Given the coordinates of four points in 2D space, return whether the four points could construct a square.
 * <p>
 * The coordinate (x,y) of a point is represented by an integer array with two integers.
 */
public class ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] arr = {p1, p2, p3, p4};
        Arrays.sort(arr, (e1, e2) -> (e1[0] == e2[0] ? e1[1] - e2[1] : e1[0] - e2[0]));
        int a = getTopLength(p1, p2);
        int b = getSideLength(p2, p3);
        int c = getTopLength(p3, p4);
        int d = getSideLength(p1, p4);
        return a == b && b == c && c == d;
    }

    private int getTopLength(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]);
    }

    private int getSideLength(int[] p1, int[] p2) {
        return Math.abs(p1[1] - p2[1]);
    }
}
