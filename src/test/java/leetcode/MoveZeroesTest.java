package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        MoveZeroes ins = new MoveZeroes();

        int[] input = {0, 1, 0, 2, 0, 3};
        ins.moveZeroes(input);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0}, input);
    }
}