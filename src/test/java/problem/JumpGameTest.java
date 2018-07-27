package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JumpGameTest {

    @Test
    public void canJump_true() {
        assertTrue(new JumpGame().canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void canJump_false() {
        assertFalse(new JumpGame().canJump(new int[]{3, 2, 1, 0, 4}));
    }
}