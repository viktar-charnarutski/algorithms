package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntersectionOfTwoArraysIITest {
    private IntersectionOfTwoArraysII ins = new IntersectionOfTwoArraysII();

    @Test
    public void intersect() {
        assertArrayEquals(new int[]{2, 2}, ins.intersect(new int[]{1, 2, 2, 1}, new int[]{3, 2, 2, 3}));
        assertArrayEquals(new int[]{}, ins.intersect(new int[]{1, 2, 2, 1}, new int[]{3, 4, 4, 3}));
        assertArrayEquals(new int[]{1}, ins.intersect(new int[]{1, 2, 2, 1}, new int[]{3, 4, 1, 3}));
    }
}