package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 378. Kth Smallest Element in a Sorted Matrix
 * <p>
 * Given a n x n matrix where each of the rows and columns are sorted in ascending order,
 * find the kth smallest element in the matrix.
 * <p>
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 */
public class KthSmallestElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix.length == 0) return 0;

        PriorityQueue<Point> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        queue.offer(new Point(matrix[0][0], 0, 0));
        for (int i = 1; i < k; i++) {
            Point point = queue.poll();
            if (point.x + 1 < matrix.length) {
                queue.offer(new Point(matrix[point.x + 1][point.y], point.x + 1, point.y));
            }

            if (point.x == 0 && (point.y + 1) < matrix.length) {
                queue.offer(new Point(matrix[point.x][point.y + 1], point.x, point.y + 1));
            }
        }
        return queue.poll().val;
    }

    private class Point {
        int val;
        int x;
        int y;

        Point(int val, int x, int y) {
            this.val = val;
            this.x = x;
            this.y = y;
        }
    }
}
