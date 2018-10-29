package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class XOfKindInDeckOfCardsTest {

    @Test
    public void hasGroupsSizeX1() {
        assertTrue(new XOfKindInDeckOfCards().hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
    }

    @Test
    public void hasGroupsSizeX2() {
        assertFalse(new XOfKindInDeckOfCards().hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
    }

    @Test
    public void hasGroupsSizeX3() {
        assertFalse(new XOfKindInDeckOfCards().hasGroupsSizeX(new int[]{1}));
    }


    @Test
    public void hasGroupsSize4() {
        assertTrue(new XOfKindInDeckOfCards().hasGroupsSizeX(new int[]{1, 1}));
    }
}