package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class RotatedDigitsTest {

    @Test
    public void rotatedDigitsValid() {
        assertTrue(4 == new RotatedDigits().rotatedDigits(10));
    }
}