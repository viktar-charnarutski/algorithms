package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HappyNumberTest {

    @Test
    public void isHappy_19() {
        assertTrue(new HappyNumber().isHappy(19));
    }

    @Test
    public void isHappy_28() {
        assertTrue(new HappyNumber().isHappy(28));
    }

    @Test
    public void isHappy_68() {
        assertTrue(new HappyNumber().isHappy(68));
    }

    @Test
    public void isHappy_100() {
        assertTrue(new HappyNumber().isHappy(100));
    }
}