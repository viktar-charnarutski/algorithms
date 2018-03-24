package strings.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class RotatedDigitsTest {

    @Test
    public void rotatedDigitsValid() {
        assertTrue(4 == new RotatedDigits().rotatedDigits(10));
    }
}