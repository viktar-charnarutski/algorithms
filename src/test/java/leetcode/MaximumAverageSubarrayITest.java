package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumAverageSubarrayITest {

    @Test
    public void findMaxAverage() {
        MaximumAverageSubarrayI ins = new MaximumAverageSubarrayI();
        assertEquals(12.75, ins.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 0.0);
    }
}