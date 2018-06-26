package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayNestingTest {

    @Test
    public void arrayNesting() {
        ArrayNesting ins = new ArrayNesting();
        assertEquals(4, ins.arrayNesting(new int[]{5, 4, 0, 3, 1, 6, 2}));
    }
}