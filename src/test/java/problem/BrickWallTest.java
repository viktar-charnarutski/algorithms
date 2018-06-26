package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BrickWallTest {

    @Test
    public void leastBricks() {
        List<List<Integer>> wall = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(2);
        row1.add(1);
        wall.add(row1);
        List<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(1);
        row2.add(2);
        wall.add(row2);
        List<Integer> row3 = new ArrayList<>();
        row3.add(1);
        row3.add(3);
        row3.add(2);
        wall.add(row3);
        List<Integer> row4 = new ArrayList<>();
        row4.add(2);
        row4.add(4);
        wall.add(row4);
        List<Integer> row5 = new ArrayList<>();
        row5.add(3);
        row5.add(1);
        row5.add(2);
        wall.add(row5);
        List<Integer> row6 = new ArrayList<>();
        row6.add(1);
        row6.add(3);
        row6.add(1);
        row6.add(1);
        wall.add(row6);

        assertEquals(2, new BrickWall().leastBricks(wall));
    }
}