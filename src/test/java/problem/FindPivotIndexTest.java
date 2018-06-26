package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class FindPivotIndexTest {

    @Test
    public void pivotIndex_pivot_in_the_middle() {
        FindPivotIndex ins = new FindPivotIndex();
        assertSame(3, ins.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    public void pivotIndex_no_pivot() {
        FindPivotIndex ins = new FindPivotIndex();
        assertSame(-1, ins.pivotIndex(new int[]{1, 7, 3, 2, 5, 6}));
    }
}