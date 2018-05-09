package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextGreaterElementIITest {

    @Test
    public void nextGreaterElements() {
        NextGreaterElementII ins = new NextGreaterElementII();
        assertArrayEquals(new int[]{2, -1, 2}, ins.nextGreaterElements(new int[]{1, 2, 1}));
    }
}