package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class NthDigitTest {

    @Test
    public void findNthDigit() {
        NthDigit ins = new NthDigit();
        assertSame(0, ins.findNthDigit(11));
        assertSame(3, ins.findNthDigit(3));
        assertSame(2, ins.findNthDigit(2147483647));
    }
}