package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PacificAtlanticWaterFlowTest {

    @Test
    public void pacificAtlantic() {
        int[][] grid = new int[4][4];
        grid[0][0] = 0;
        grid[0][1] = 0;
        grid[0][2] = 0;
        grid[0][3] = 0;
        grid[1][0] = 0;
        grid[1][1] = 0;
        grid[1][2] = 0;
        grid[1][3] = 0;
        grid[2][0] = 0;
        grid[2][1] = 0;
        grid[2][2] = 0;
        grid[2][3] = 0;
        grid[3][0] = 0;
        grid[3][1] = 0;
        grid[3][2] = 0;
        grid[3][3] = 0;

        List<int[]> expected = new ArrayList<>();
        expected.add(new int[]{0, 4});
        expected.add(new int[]{1, 3});
        expected.add(new int[]{1, 4});
        expected.add(new int[]{2, 2});
        expected.add(new int[]{3, 0});
        expected.add(new int[]{3, 1});
        expected.add(new int[]{4, 0});

        assertEquals(expected, new PacificAtlanticWaterFlow().pacificAtlantic(grid));
    }
}