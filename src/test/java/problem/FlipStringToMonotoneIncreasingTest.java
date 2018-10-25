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

    @Test
    public void minFlipsMonoIncr3() {
        assertEquals(3, new FlipStringToMonotoneIncreasing().minFlipsMonoIncr("10101110"));
    }

    @Test
    public void minFlipsMonoIncr4() {
        assertEquals(0, new FlipStringToMonotoneIncreasing().minFlipsMonoIncr("11111111"));
    }
}