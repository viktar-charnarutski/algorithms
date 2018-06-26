package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class NimGameTest {

    @Test
    public void numGame() {
        NimGame ins = new NimGame();

        assertFalse(ins.canWinNim(4));
        assertTrue(ins.canWinNim(5));
    }
}