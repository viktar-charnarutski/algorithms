package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaysToCoverDistanceTest {

    @Test
    public void countWaysToCoverDistance() {
        WaysToCoverDistance ins = new WaysToCoverDistance();
        assertEquals(4, ins.countWaysToCoverDistance(3));
        assertEquals(7, ins.countWaysToCoverDistance(4));
        assertEquals(44, ins.countWaysToCoverDistance(7));
    }
}