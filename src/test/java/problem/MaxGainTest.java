package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxGainTest {

    @Test
    public void maxGain1() {
        assertEquals(100, MaxGain.maxGain(new int[]{0, 50, 10, 100, 30}));
    }
}