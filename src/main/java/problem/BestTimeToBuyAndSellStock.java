package problem;

/**
 * 121. Best Time to Buy and Sell Stock
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * <p>
 * Note that you cannot sell a stock before you buy one.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = -1;
        int prof = max - min;
        for (int price : prices) {
            if (price < min) {
                min = price;
                max = price;
                continue;
            }
            if (price > max) {
                max = price;
                prof = Math.max(max - min, prof);
            }
        }
        return prof > 0 ? prof : 0;
    }
}
