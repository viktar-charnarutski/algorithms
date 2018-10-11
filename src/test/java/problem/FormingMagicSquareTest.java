package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormingMagicSquareTest {

    @Test
    public void formingMagicSquare1() {
        assertEquals(7, FormingMagicSquare.formingMagicSquare(new int[][]{{5, 3, 4}, {1, 5, 8}, {6, 4, 2}}));
    }

    @Test
    public void formingMagicSquare2() {
        assertEquals(7, FormingMagicSquare.formingMagicSquare(new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 5}}));
    }
}