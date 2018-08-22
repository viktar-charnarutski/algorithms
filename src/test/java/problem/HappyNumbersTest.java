package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HappyNumbersTest {

    @Test
    public void isHappyNumber_19() {
        assertTrue(new HappyNumbers().isHappyNumber(19));
    }
}