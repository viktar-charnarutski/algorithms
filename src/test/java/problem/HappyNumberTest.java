package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HappyNumberTest {

    @Test
    public void isHappy() {
        HappyNumber ins = new HappyNumber();
        assertTrue(ins.isHappy(19));
        assertFalse(ins.isHappy(191));
    }
}