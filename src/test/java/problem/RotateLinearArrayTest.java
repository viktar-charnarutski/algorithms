package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateLinearArrayTest {

    @Test
    public void rotateLeft1() {
        assertEquals(new int[]{3, 4, 5, 1, 2}, RotateLinearArray.rotateLeft(new int[]{1, 2, 3, 4, 5}, 2));
    }
}