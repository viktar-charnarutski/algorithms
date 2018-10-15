package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonDivisibleSubsetTest {

    @Test
    public void nonDivisibleSubset1() {
        assertEquals(3, NonDivisibleSubset.nonDivisibleSubset(3, new int[]{1, 7, 2, 4}));
    }

    @Test
    public void nonDivisibleSubset2() {
        assertEquals(11, NonDivisibleSubset.nonDivisibleSubset(7, new int[]{278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436}));
    }
}