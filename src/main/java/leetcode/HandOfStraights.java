package leetcode;

import java.util.PriorityQueue;

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
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i : hand) q.offer(i);
        while (q.size() != 0) {
            int c = q.poll();
            for (int i = 1; i < W; i++) {
                if (!q.remove(c + i)) return false;
            }
        }
        return true;
    }
}