package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleRiffleShuffleTest {

    @Test
    public void isSingleRiffle() {
        int[] half1 = {3, 4, 5, 6};
        int[] half2 = {7, 8, 9, 10};
        int[] shuffledDeck = {3, 4, 7, 8, 9, 5, 10, 6};
        assertTrue(SingleRiffleShuffle.isSingleRiffle(half1, half2, shuffledDeck));
    }
}