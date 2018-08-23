package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxGainTest {

    @Test
    public void maxGain1() {
        assertEquals(100, MaxGain.maxGain(new int[]{0, 50, 10, 100, 30}));
    }

    @Test
    public void maxGain2() {
        assertEquals(0, MaxGain.maxGain(new int[]{100, 40, 20, 10}));
    }

    @Test
    public void maxGain3() {
        assertEquals(0, MaxGain.maxGain(new int[]{1, 1}));
    }

    @Test
    public void maxGain4() {
        assertEquals(100, MaxGain.maxGain(new int[]{0, 100, 0, 100, 0, 100}));
    }
}