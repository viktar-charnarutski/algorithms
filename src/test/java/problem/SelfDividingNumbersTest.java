package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class SelfDividingNumbersTest {

    @Test
    public void selfDividingNumbers() {
        SelfDividingNumbers ins = new SelfDividingNumbers();
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22), ins.selfDividingNumbers(1, 22));
    }
}