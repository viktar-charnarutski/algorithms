package leetcode.easy;

/**
 * 441. Arranging Coins
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have
 * exactly k coins.
 * <p>
 * Given n, find the total number of full staircase rows that can be formed.
 * <p>
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int i = 1;
        int count = n;
        while (count > 0) {
            i++;
            count -= i;
        }
        return i - 1;
    }
}
