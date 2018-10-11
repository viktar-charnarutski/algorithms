package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormingMagicSquareTest {

    @Test
    public void formingMagicSquare() {
        assertEquals(7, FormingMagicSquare.formingMagicSquare(new int[][]{{5, 3, 4}, {1, 5, 8}, {6, 4, 2}}));
    }
}