package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateLinearArrayTest {

    @Test
    public void rotateLeft1() {
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, RotateLinearArray.rotateLeft(new int[]{1, 2, 3, 4, 5}, 2));
    }

    @Test
    public void rotateLeft2() {
        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1}, RotateLinearArray.rotateLeft(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
    }

    @Test
    public void rotateLeft3() {
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 8, 9, 1, 2}, RotateLinearArray.rotateLeft(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 2));
    }

    @Test
    public void rotateLeft4() {
        assertArrayEquals(new int[]{6, 7, 8, 9, 1, 2, 3, 4, 5}, RotateLinearArray.rotateLeft(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 14));
    }
}