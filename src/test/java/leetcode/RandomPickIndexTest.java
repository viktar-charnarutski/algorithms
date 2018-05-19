package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RandomPickIndexTest {

    @Test
    public void pick1() {
        RandomPickIndex ins = new RandomPickIndex(new int[]{1, 2, 3, 3, 3});
        assertEquals(0, ins.pick(1));
    }
    @Test
    public void pick2() {
        RandomPickIndex ins = new RandomPickIndex(new int[]{1, 2, 3, 3, 3});
        assertEquals(1, ins.pick(2));
    }

    @Test
    public void pick3() {
        RandomPickIndex ins = new RandomPickIndex(new int[]{1, 2, 3, 3, 3});
        assertNotEquals(0, ins.pick(3));
        assertNotEquals(1, ins.pick(3));
    }
}