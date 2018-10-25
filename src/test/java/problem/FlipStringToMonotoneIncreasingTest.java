package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlipStringToMonotoneIncreasingTest {

    @Test
    public void minFlipsMonoIncr1() {
        assertEquals(1, new FlipStringToMonotoneIncreasing().minFlipsMonoIncr("00000010"));
    }

    @Test
    public void minFlipsMonoIncr2() {
        assertEquals(2, new FlipStringToMonotoneIncreasing().minFlipsMonoIncr("00001010"));
    }
}