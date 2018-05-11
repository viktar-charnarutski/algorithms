package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ShuffleAnArrayTest {

    @Test
    public void reset() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        ShuffleAnArray ins = new ShuffleAnArray(input);
        assertArrayEquals(input, ins.reset());
    }

    @Test
    public void shuffle() {
    }
}