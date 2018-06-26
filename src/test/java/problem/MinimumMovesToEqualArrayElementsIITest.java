package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumMovesToEqualArrayElementsIITest {

    @Test
    public void minMoves2() {
        MinimumMovesToEqualArrayElementsII ins = new MinimumMovesToEqualArrayElementsII();
        assertEquals(2, ins.minMoves2(new int[]{1, 2, 3}));
    }

    @Test
    public void minMoves21() {
        MinimumMovesToEqualArrayElementsII ins = new MinimumMovesToEqualArrayElementsII();
        assertEquals(14, ins.minMoves2(new int[]{1, 0, 0, 8, 6}));
    }
}