package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaysToCoverDistanceTest {

    @Test
    public void countWaysToCoverDistance() {
        assertEquals(4, new WaysToCoverDistance().countWaysToCoverDistance(3));
        assertEquals(4, new WaysToCoverDistance().countWaysToCoverDistance(7));
    }
}