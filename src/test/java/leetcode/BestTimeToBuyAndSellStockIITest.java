package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockIITest {

    @Test
    public void maxProfit1() {
        assertEquals(7, new BestTimeToBuyAndSellStockII().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void maxProfit2() {
        assertEquals(4, new BestTimeToBuyAndSellStockII().maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void maxProfit3() {
        assertEquals(0, new BestTimeToBuyAndSellStockII().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void maxProfit4() {
        assertEquals(0, new BestTimeToBuyAndSellStockII().maxProfit(new int[]{}));
    }
}