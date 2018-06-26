package problem;

import java.util.HashMap;
import java.util.List;

/**
 * 554. Brick Wall
 * <p>
 * There is a brick wall in front of you. The wall is rectangular and has several rows of bricks.
 * The bricks have the same height but different width. You want to draw a vertical line from the top to the bottom
 * and cross the least bricks.
 * <p>
 * The brick wall is represented by a list of rows. Each row is a list of integers representing the width of each brick
 * in this row from left to right.
 * <p>
 * If your line go through the edge of a brick, then the brick is not considered as crossed. You need to find out
 * how to draw the line to cross the least bricks and return the number of crossed bricks.
 */
public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        int count = 0;
        HashMap<Integer, Integer> bricks = new HashMap<>();
        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                bricks.put(sum, bricks.getOrDefault(sum, 0) + 1);
                count = Math.max(bricks.get(sum), count);
            }
        }
        return wall.size() - count;
    }
}