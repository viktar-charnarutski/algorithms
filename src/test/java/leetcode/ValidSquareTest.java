package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidSquareTest {

    @Test
    public void validSquare() {
        assertTrue(new ValidSquare().validSquare(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{0, 1}));
    }
}