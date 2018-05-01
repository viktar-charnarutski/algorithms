package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class ThirdMaximumNumberTest {

    @Test
    public void thirdMax() {
        ThirdMaximumNumber ins = new ThirdMaximumNumber();
        assertSame(1, ins.thirdMax(new int[]{3, 2, 1}));
        assertSame(2, ins.thirdMax(new int[]{1, 2}));
        assertSame(1, ins.thirdMax(new int[]{2, 2, 3, 1}));
        assertSame(-2147483648, ins.thirdMax(new int[]{1,2,-2147483648}));

    }
}