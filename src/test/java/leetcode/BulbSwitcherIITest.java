package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BulbSwitcherIITest {

    @Test
    public void flipLights() {
        BulbSwitcherII ins = new BulbSwitcherII();
        assertEquals(2, ins.flipLights(1, 1));
    }

    @Test
    public void flipLights1() {
        BulbSwitcherII ins = new BulbSwitcherII();
        assertEquals(3, ins.flipLights(2, 1));
    }

    @Test
    public void flipLights2() {
        BulbSwitcherII ins = new BulbSwitcherII();
        assertEquals(4, ins.flipLights(3, 1));
    }
}