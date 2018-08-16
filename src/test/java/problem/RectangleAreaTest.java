package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleAreaTest {

    @Test
    public void computeArea() {
        assertEquals(45, new RectangleArea().computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }
}