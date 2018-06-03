package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContiguousArrayTest {

    @Test
    public void findMaxLength1() {
        assertEquals(2, new ContiguousArray().findMaxLength(new int[]{0, 1}));
    }

    @Test
    public void findMaxLength2() {
        assertEquals(2, new ContiguousArray().findMaxLength(new int[]{0, 1, 0}));
    }

    @Test
    public void findMaxLength3() {
        assertEquals(2, new ContiguousArray().findMaxLength(new int[]{1, 1, 1, 0, 1, 1, 1, 0}));
    }
}