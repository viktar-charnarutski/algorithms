package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumNumberOfRepetitionsTest {

    @Test
    public void getMaxRepetition1() {
        assertEquals(4, MaximumNumberOfRepetitions.getMaxRepetition(new int[]{3, 1, 2, 2, 3, 4, 4, 4}));
    }
}