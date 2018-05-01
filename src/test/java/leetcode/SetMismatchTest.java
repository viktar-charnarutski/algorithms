package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SetMismatchTest {

    @Test
    public void findErrorNums() {
        SetMismatch ins = new SetMismatch();
        assertArrayEquals(new int[]{2, 3}, ins.findErrorNums(new int[]{1, 2, 2, 4}));
    }

    @Test
    public void findErrorNums_2_elements() {
        SetMismatch ins = new SetMismatch();
        assertArrayEquals(new int[]{2, 1}, ins.findErrorNums(new int[]{2, 2}));
    }

    @Test
    public void findErrorNums_last_2_elements_duplicates() {
        SetMismatch ins = new SetMismatch();
        assertArrayEquals(new int[]{5, 4}, ins.findErrorNums(new int[]{1, 2, 3, 5, 5, 6}));
    }
}