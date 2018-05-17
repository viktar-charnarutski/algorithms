package leetcode;

/**
 * 309. Best Time to Buy and Sell Stock with Cooldown
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times) with the following restrictions:
 * <p>
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
 */
public class BestTimeToBuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices) {
        int moneyAfterPurchase = Integer.MIN_VALUE, moneyAfterPrevPurchase;
        int moneyAfterSelling = 0, moneyAfterPrevSelling = 0;

        for (int price : prices) {
            moneyAfterPrevPurchase = moneyAfterPurchase;
            moneyAfterPurchase = Math.max(moneyAfterPrevSelling - price, moneyAfterPurchase);

            moneyAfterPrevSelling = moneyAfterSelling;
            moneyAfterSelling = Math.max(moneyAfterPrevPurchase + price, moneyAfterSelling);
        }

        return moneyAfterSelling;
    }
}
