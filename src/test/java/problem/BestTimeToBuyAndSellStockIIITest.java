package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockIIITest {

    @Test
    public void maxProfit1() {
        assertEquals(6, new BestTimeToBuyAndSellStockIII().maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }

    @Test
    public void maxProfit2() {
        assertEquals(4, new BestTimeToBuyAndSellStockIII().maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void maxProfit3() {
        assertEquals(0, new BestTimeToBuyAndSellStockIII().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void maxProfit4() {
        assertEquals(11, new BestTimeToBuyAndSellStockIII().maxProfit(new int[]{2, 1, 4, 5, 2, 9, 7}));
    }
}