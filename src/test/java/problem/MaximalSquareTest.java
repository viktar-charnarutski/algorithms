package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalSquareTest {

    @Test
    public void maximalSquare() {
        char[][] input = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'},
        };
        assertEquals(4, new MaximalSquare().maximalSquare(input));
    }
}