package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditDistanceTest {

    @Test
    public void editDistance1() {
        assertEquals(1, new EditDistance().editDistance("geek", "gesek"));
    }

    @Test
    public void editDistance2() {
        assertEquals(1, new EditDistance().editDistance("cat", "cart"));
    }

    @Test
    public void editDistance3() {
        assertEquals(1, new EditDistance().editDistance("sunday", "saturday"));
    }
}