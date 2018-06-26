package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChangeTest {

    @Test
    public void coinChange1() {
        assertEquals(3, new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void coinChange2() {
        assertEquals(-1, new CoinChange().coinChange(new int[]{2}, 3));
    }

    @Test
    public void coinChange3() {
        assertEquals(4, new CoinChange().coinChange(new int[]{2, 5, 10, 1}, 27));
    }
}