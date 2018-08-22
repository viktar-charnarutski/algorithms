package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HappyNumberTest {

    @Test
    public void isHappy_19() {
        assertTrue(new HappyNumber().isHappy(19));
    }
}