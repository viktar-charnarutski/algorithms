package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingBitsTest {

    @Test
    public void countBits1() {
        assertArrayEquals(new int[]{0, 1, 1}, new CountingBits().countBits(2));
    }

    @Test
    public void countBits2() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, new CountingBits().countBits(5));
    }
}