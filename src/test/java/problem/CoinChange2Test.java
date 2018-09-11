package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChange2Test {

    @Test
    public void change1() {
        assertEquals(4, new CoinChange2().change(5, new int[]{1, 2, 5}));
    }
}