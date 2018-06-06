package leetcode;

import java.util.Arrays;

/**
 * 846. Hand of Straights
 * <p>
 * Alice has a hand of cards, given as an array of integers.
 * <p>
 * Now she wants to rearrange the cards into groups so that each group is size W, and consists of W consecutive cards.
 * <p>
 * Return true if and only if she can.
 */
public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand == null || hand.length % W != 0) return false;
        Arrays.sort(hand);
        for (int i = 1; i < hand.length; i += W) {
            for (int j = i; j < W - 1; j++) {
                if (hand[j] - hand[j - 1] != 1) return false;
            }
        }
        return true;
    }
}
