package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit1() {
        assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
    @Test
    public void maxProfit2() {
        assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 6, 5, 4, 3, 2, 1}));
    }
}