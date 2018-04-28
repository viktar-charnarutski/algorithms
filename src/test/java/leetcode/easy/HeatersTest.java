package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class HeatersTest {

    @Test
    public void findRadius() {
        Heaters ins = new Heaters();
        assertSame(1, ins.findRadius(new int[]{1, 2, 3}, new int[]{2}));
        assertSame(1, ins.findRadius(new int[]{1, 2, 3, 4}, new int[]{1, 4}));
    }
}