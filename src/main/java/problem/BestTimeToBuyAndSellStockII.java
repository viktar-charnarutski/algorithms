package problem;

/**
 * 122. Best Time to Buy and Sell Stock II
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (i.e., buy one and sell one share of the stock multiple times).
 * <p>
 * Note: You may not engage in multiple transactions at the same time
 * (i.e., you must sell the stock before you buy again).
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int budget = -prices[0];
        int profit = 0;
        for (int price : prices) {
            budget = Math.max(profit - price, budget);
            profit = Math.max(budget + price, profit);
        }
        return profit;
    }
}
