package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {

    @Test
    public void plusOne_last_one_dig() {
        PlusOne ins = new PlusOne();
        assertArrayEquals(new int[]{3}, ins.plusOne(new int[]{2}));
    }

    @Test
    public void plusOne_last_dig_less_than_9() {
        PlusOne ins = new PlusOne();
        assertArrayEquals(new int[]{1, 2, 4}, ins.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void plusOne_last_dig_is_9() {
        PlusOne ins = new PlusOne();
        assertArrayEquals(new int[]{1, 3, 0}, ins.plusOne(new int[]{1, 2, 9}));
    }

    @Test
    public void plusOne_all_dig_are_9() {
        PlusOne ins = new PlusOne();
        assertArrayEquals(new int[]{1, 0, 0, 0}, ins.plusOne(new int[]{9, 9, 9}));
    }

    @Test
    public void plusOne_empty_input() {
        PlusOne ins = new PlusOne();
        assertArrayEquals(new int[]{}, ins.plusOne(new int[]{}));
    }
}