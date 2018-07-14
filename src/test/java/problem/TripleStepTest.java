package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleStepTest {

    @Test
    public void tripleStep() {
        assertEquals(4, new TripleStep().tripleStep(3));
    }
}