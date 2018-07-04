package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LemonadeChangeTest {

    @Test
    public void lemonadeChange1() {
        assertTrue(new LemonadeChange().lemonadeChange(new int[]{5, 5, 5, 10, 20}));
    }

    @Test
    public void lemonadeChange2() {
        assertTrue(new LemonadeChange().lemonadeChange(new int[]{5, 5, 10}));
    }

    @Test
    public void lemonadeChange3() {
        assertFalse(new LemonadeChange().lemonadeChange(new int[]{10, 10}));
    }

    @Test
    public void lemonadeChange4() {
        assertFalse(new LemonadeChange().lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }
}