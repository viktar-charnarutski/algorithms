package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SingleNumberIIITest {

    @Test
    public void singleNumber() {
        SingleNumberIII ins = new SingleNumberIII();
        assertArrayEquals(new int[]{3, 5}, ins.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
    }
}