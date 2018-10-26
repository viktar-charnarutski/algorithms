package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumWithMultiplicityTest {

    @Test
    public void threeSumMulti() {
        assertEquals(20, new ThreeSumWithMultiplicity().threeSumMulti(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8));
    }
}