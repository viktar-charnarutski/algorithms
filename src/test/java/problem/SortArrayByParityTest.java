package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayByParityTest {

    @Test
    public void sortArrayByParity() {
        assertArrayEquals(new int[]{2, 4, 3, 1}, new SortArrayByParity().sortArrayByParity(new int[]{3, 1, 2, 4}));
    }
}