package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JumpGameTest {

    @Test
    public void canJump_true1() {
        assertTrue(new JumpGame().canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void canJump_true2() {
        assertTrue(new JumpGame().canJump(new int[]{1, 2, 3}));
    }

    @Test
    public void canJump_true3() {
        assertTrue(new JumpGame().canJump(new int[]{2, 0}));
    }

    @Test
    public void canJump_false() {
        assertFalse(new JumpGame().canJump(new int[]{3, 2, 1, 0, 4}));
    }
}