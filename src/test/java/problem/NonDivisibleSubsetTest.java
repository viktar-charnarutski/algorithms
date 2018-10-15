package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonDivisibleSubsetTest {

    @Test
    public void nonDivisibleSubset() {
        assertEquals(3, NonDivisibleSubset.nonDivisibleSubset(3, new int[] {1, 7, 2, 4}));
    }
}