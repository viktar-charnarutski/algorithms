package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CountBinarySubstringsTest {

    @Test
    public void countBinarySubstrings() {
        assertTrue(6 == new CountBinarySubstrings().countBinarySubstrings("00110011"));
    }
}