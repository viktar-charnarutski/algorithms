package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    @Test
    public void maxProfit() {
        assertEquals(8, new BestTimeToBuyAndSellStockWithTransactionFee().maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }
}