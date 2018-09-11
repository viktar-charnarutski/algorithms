package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChange2Test {

    @Test
    public void change1() {
        assertEquals(4, new CoinChange2().change(5, new int[]{1, 2, 5}));
    }

    @Test
    public void change2() {
        assertEquals(0, new CoinChange2().change(3, new int[]{2}));
    }

    @Test
    public void change3() {
        assertEquals(1, new CoinChange2().change(10, new int[]{10}));
    }
}