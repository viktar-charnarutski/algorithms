package problem;

/**
 * 714. Best Time to Buy and Sell Stock with Transaction Fee
 * <p>
 * Your are given an array of integers prices, for which the i-th element is the price of a given stock on day i;
 * and a non-negative integer fee representing a transaction fee.
 * <p>
 * You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.
 * You may not buy more than 1 share of a stock at a time (ie. you must sell the stock share before you buy again.)
 * <p>
 * Return the maximum profit you can make.
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int budget = -prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            budget = Math.max(profit - prices[i], budget);
            profit = Math.max(budget + prices[i] - fee, profit);
        }
        return profit;
    }
}
