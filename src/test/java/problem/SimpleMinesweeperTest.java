package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleMinesweeperTest {

    @Test
    public void findBombClusters() {
        int[][] grid = {
                {0, 1, 0, 1},
                {0, 1, 1, 1},
                {0, 0, 0, 0},
                {0, 1, 0, 0}
        };
        List<List<int[]>> result = new SimpleMinesweeper().findBombClusters(grid);
        assertEquals(2, result.size());
        assertEquals(5, result.get(0).size());
        assertEquals(1, result.get(1).size());
        assertArrayEquals(new int[]{0, 1}, result.get(0).get(0));
        assertArrayEquals(new int[]{0, 3}, result.get(0).get(4));
        assertArrayEquals(new int[]{1, 1}, result.get(0).get(1));
        assertArrayEquals(new int[]{1, 2}, result.get(0).get(2));
        assertArrayEquals(new int[]{1, 3}, result.get(0).get(3));
        assertArrayEquals(new int[]{3, 1}, result.get(1).get(0));
    }
}