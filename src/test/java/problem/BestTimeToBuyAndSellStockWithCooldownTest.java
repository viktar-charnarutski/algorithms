package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockWithCooldownTest {

    @Test
    public void maxProfit() {
        assertEquals(3, new BestTimeToBuyAndSellStockWithCooldown().maxProfit(new int[]{1, 2, 3, 0, 2}));
    }
}