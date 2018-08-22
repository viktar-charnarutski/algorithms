package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HappyNumbersTest {

    @Test
    public void isHappyNumber_19() {
        assertTrue(new HappyNumbers().isHappyNumber(19));
    }

    @Test
    public void isHappyNumber_28() {
        assertTrue(new HappyNumbers().isHappyNumber(28));
    }

    @Test
    public void isHappyNumber_68() {
        assertTrue(new HappyNumbers().isHappyNumber(68));
    }

    @Test
    public void isHappyNumber_100() {
        assertTrue(new HappyNumbers().isHappyNumber(100));
    }
}