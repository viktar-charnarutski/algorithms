package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPerfectSquareTest {

    @Test
    public void isPerfectSquare() {
        ValidPerfectSquare ins = new ValidPerfectSquare();
        assertTrue(ins.isPerfectSquare(16));
        assertFalse(ins.isPerfectSquare(14));
    }
}