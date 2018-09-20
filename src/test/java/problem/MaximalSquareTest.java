package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalSquareTest {

    @Test
    public void maximalSquare1() {
        char[][] input = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'},
        };
        assertEquals(4, new MaximalSquare().maximalSquare(input));
    }

    @Test
    public void maximalSquare2() {
        char[][] input = {
                {'0', '0', '0', '1'},
                {'1', '1', '0', '1'},
                {'1', '1', '1', '1'},
                {'0', '1', '1', '1'},
                {'0', '1', '1', '1'}
        };
        assertEquals(9, new MaximalSquare().maximalSquare(input));
    }
}