package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class NumArrayTest {

    @Test
    public void sumRange() {
        NumArray ins = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertSame(1, ins.sumRange(0, 2));
        assertSame(-1, ins.sumRange(2, 5));
        assertSame(-3, ins.sumRange(0, 5));
    }
}