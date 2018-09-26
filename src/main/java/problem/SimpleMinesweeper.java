package problem;

import java.util.Collections;
import java.util.List;

/**
 * Simple Minesweeper
 * <p>
 * Given a 2D matrix with 'bombs' - cells marked with '1', and empty spaces - cells marked with '0'.
 * Find all bomb clusters which are being formed with cells of '1' connected by sides.
 * <p>
 * Example:
 * <p>
 * Grid:
 * [0, 1, 0, 1],
 * [0, 1, 1, 1],
 * [0, 0, 0, 0],
 * [0, 1, 0, 0]
 * <p>
 * Result:
 * {[0,1], [0,3], [1,1], [1,2], [1,3]},
 * {[3,1]}
 */
public class SimpleMinesweeper {
    public List<List<int[]>> findBombClusters(int[][] grid) {
        return Collections.emptyList();
    }
}
