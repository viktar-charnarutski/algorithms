package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class DegreeOfAnArrayTest {

    private DegreeOfAnArray ins = new DegreeOfAnArray();

    @Test
    public void findShortestSubArray() {
        assertSame(2, ins.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
        assertSame(5, ins.findShortestSubArray(new int[]{1, 2, 4, 3, 1}));
        assertSame(1, ins.findShortestSubArray(new int[]{1}));
        assertSame(1, ins.findShortestSubArray(new int[]{1, 2}));
        assertSame(2, ins.findShortestSubArray(new int[]{1, 2, 2}));
        assertSame(2, ins.findShortestSubArray(new int[]{2, 2, 1}));
        assertSame(0, ins.findShortestSubArray(new int[]{}));
    }
}