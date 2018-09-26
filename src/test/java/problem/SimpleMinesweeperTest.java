package problem;

import org.junit.Test;

import java.util.ArrayList;
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
        List<List<int[]>> expected = new ArrayList<>();
        List<int[]> cluster1 = new ArrayList<>();
        cluster1.add(new int[]{0, 1});
        cluster1.add(new int[]{0, 3});
        cluster1.add(new int[]{1, 1});
        cluster1.add(new int[]{1, 2});
        cluster1.add(new int[]{1, 3});
        expected.add(cluster1);
        List<int[]> cluster2 = new ArrayList<>();
        cluster2.add(new int[]{3, 1});
        expected.add(cluster2);
        assertEquals(expected, new SimpleMinesweeper().findBombClusters(grid));
    }
}