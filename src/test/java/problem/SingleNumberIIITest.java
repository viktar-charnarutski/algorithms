package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SingleNumberIIITest {

    @Test
    public void singleNumber() {
        SingleNumberIII ins = new SingleNumberIII();
        int[] actuals = ins.singleNumber(new int[]{1, 2, 1, 3, 2, 5});
        assertArrayEquals(new int[]{5, 3}, actuals);
    }
}