package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MaximumProductOfThreeNumbersTest {

    private MaximumProductOfThreeNumbers ins = new MaximumProductOfThreeNumbers();

    @Test
    public void maximumProduct() {
        assertSame(24, ins.maximumProduct(new int[]{1, 2, 3, 4}));
        assertSame(84, ins.maximumProduct(new int[]{7, 2, 3, 4}));
        assertSame(720, ins.maximumProduct(new int[]{-4, -3, -2, -1, 60}));
    }
}