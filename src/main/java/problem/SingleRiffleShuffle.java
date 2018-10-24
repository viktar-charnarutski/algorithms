package problem;

import java.util.Arrays;

/**
 * Single Riffle Shuffle.
 * <p>
 * I figured out how to get rich: online poker.
 */
public class SingleRiffleShuffle {
    public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck) {
        if (shuffledDeck.length == 0) return true;
        if (half1.length > 0 && half1[0] == shuffledDeck[0]) {
            return isSingleRiffle(slicedArray(half1), half2, slicedArray(shuffledDeck));
        } else if (half2.length > 0 && half2[0] == shuffledDeck[0]) {
            return isSingleRiffle(half1, slicedArray(half2), slicedArray(shuffledDeck));
        } else {
            return false;
        }
    }

    private static int[] slicedArray(int[] deck) {
        return Arrays.copyOfRange(deck, 1, deck.length);
    }
}
