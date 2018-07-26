package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class PacificAtlanticWaterFlowTest {

    @Test
    public void pacificAtlantic1() {
        int[][] grid = new int[5][5];
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 2;
        grid[0][3] = 3;
        grid[0][4] = 5;
        grid[1][0] = 3;
        grid[1][1] = 2;
        grid[1][2] = 3;
        grid[1][3] = 4;
        grid[1][4] = 4;
        grid[2][0] = 2;
        grid[2][1] = 4;
        grid[2][2] = 5;
        grid[2][3] = 3;
        grid[2][4] = 1;
        grid[3][0] = 6;
        grid[3][1] = 7;
        grid[3][2] = 1;
        grid[3][3] = 4;
        grid[3][4] = 5;
        grid[4][0] = 5;
        grid[4][1] = 1;
        grid[4][2] = 1;
        grid[4][3] = 2;
        grid[4][4] = 4;

        List<int[]> expected = new ArrayList<>();
        expected.add(new int[]{0, 4});
        expected.add(new int[]{1, 3});
        expected.add(new int[]{1, 4});
        expected.add(new int[]{2, 2});
        expected.add(new int[]{3, 0});
        expected.add(new int[]{3, 1});
        expected.add(new int[]{4, 0});

        List<int[]> output = new PacificAtlanticWaterFlow().pacificAtlantic(grid);
        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), output.get(i));
        }
        // output.forEach(x -> System.out.println(Arrays.toString(x)));
    }

    @Test
    public void pacificAtlantic2() {
        int[][] grid = new int[3][3];
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[1][0] = 8;
        grid[1][1] = 9;
        grid[1][2] = 4;
        grid[2][0] = 7;
        grid[2][1] = 6;
        grid[2][2] = 5;

        List<int[]> expected = new ArrayList<>();
        expected.add(new int[]{0, 2});
        expected.add(new int[]{1, 0});
        expected.add(new int[]{1, 1});
        expected.add(new int[]{1, 2});
        expected.add(new int[]{2, 0});
        expected.add(new int[]{2, 1});
        expected.add(new int[]{2, 2});

        List<int[]> output = new PacificAtlanticWaterFlow().pacificAtlantic(grid);
        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), output.get(i));
        }
        // output.forEach(x -> System.out.println(Arrays.toString(x)));
    }
}