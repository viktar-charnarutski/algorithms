package problem;

/**
 * 518. Coin Change 2
 * <p>
 * You are given coins of different denominations and a total amount of money. Write a function to compute the number
 * of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.
 * <p>
 * Note: You can assume that
 * <p>
 * 0 <= amount <= 5000
 * 1 <= coin <= 5000
 * the number of coins is less than 500
 * the answer is guaranteed to fit into signed 32-bit integer
 */
public class CoinChange2 {
    public int change(int amount, int[] coins) {
        if (amount <= 0 || coins.length == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int sum = 1; sum <= amount; sum++) {
                if (sum - coin >= 0) {
                    dp[sum] += dp[sum - coin];
                }
            }
        }
        return dp[amount];
    }
}
