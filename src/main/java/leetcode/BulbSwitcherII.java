package leetcode;

/**
 * 672. Bulb Switcher II
 *
 * There is a room with n lights which are turned on initially and 4 buttons on the wall.
 * After performing exactly m unknown operations towards buttons, you need to return how many different
 * kinds of status of the n lights could be.
 *
 * Suppose n lights are labeled as number [1, 2, 3 ..., n], function of these 4 buttons are given below:
 *
 * Flip all the lights.
 * Flip lights with even numbers.
 * Flip lights with odd numbers.
 * Flip lights with (3k + 1) numbers, k = 0, 1, 2, ...
 */
public class BulbSwitcherII {
    public int flipLights(int n, int m) {
        // the first 3 lights uniquely determine the rest of the sequence
        n = Math.min(n, 3);

        if (m == 0) return 1;
        if (m == 1) return n == 1 ? 2 : n == 2 ? 3 : 4;
        if (m == 2) return n == 1 ? 2 : n == 2 ? 4 : 7;
        return n == 1 ? 2 : n == 2 ? 4 : 8;
    }
}
