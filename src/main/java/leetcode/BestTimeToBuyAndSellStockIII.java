package leetcode;

/**
 * 123. Best Time to Buy and Sell Stock III
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 * <p>
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */
public class BestTimeToBuyAndSellStockIII {
    public int maxProfit(int[] prices) {
        int budget1 = Integer.MIN_VALUE;
        int budget2 = Integer.MIN_VALUE;
        int profit1 = 0;
        int profit2 = 0;
        for (int price : prices) {
            budget1 = Math.max(-price, budget1);
            profit1 = Math.max(budget1 + price, profit1);
            budget2 = Math.max(profit1 - price, budget2);
            profit2 = Math.max(budget2 + price, profit2);
        }
        return profit2;
    }
}
