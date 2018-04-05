package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SingleNumberTest {

    @Test
    public void singleNumber() {
        SingleNumber ins = new SingleNumber();
        assertTrue(5 == ins.singleNumber(new int[] {1, 2, 3, 4, 5, 1, 2, 3, 4}));
    }
}