package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 914. X of a Kind in a Deck of Cards
 *
 * In a deck of cards, each card has an integer written on it.
 *
 * Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more
 * groups of cards, where:
 *
 * Each group has exactly X cards.
 * All the cards in each group have the same integer.
 */
public class XOfKindInDeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : deck) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int num : count.values()) {
            res = greatestCommonDivider(num, res);
        }
        return res > 1;
    }

    private static int greatestCommonDivider(int a, int b) {
        return b > 0 ? greatestCommonDivider(b, a % b) : a;
    }
}
