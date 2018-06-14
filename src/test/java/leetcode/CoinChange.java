package leetcode;

/**
 * 322. Coin Change
 * <p>
 * You are given coins of different denominations and a total amount of money amount.
 * Write a function to compute the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        return coinChange(coins, amount, new int[amount + 1]);
    }

    private int coinChange(int[] coins, int amount, int[] memo) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        if (memo[amount] != 0) return memo[amount];

        int min = Integer.MAX_VALUE;
        for (int c : coins) {
            int res = coinChange(coins, amount - c, memo);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        memo[amount] = min != Integer.MAX_VALUE ? min : -1;
        return memo[amount];
    }
}
