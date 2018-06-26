package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class ArrangingCoinsTest {

    @Test
    public void arrangeCoins() {
        ArrangingCoins ins = new ArrangingCoins();
        assertSame(2, ins.arrangeCoins(5));
        assertSame(3, ins.arrangeCoins(8));
    }
}