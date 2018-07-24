package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberIITest {

    @Test
    public void rob1() {
        assertEquals(4, new HouseRobberII().rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void rob2() {
        assertEquals(3, new HouseRobberII().rob(new int[]{2, 3, 2}));
    }

    @Test
    public void rob3_one_element() {
        assertEquals(1, new HouseRobberII().rob(new int[]{1}));
    }
}