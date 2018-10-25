package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayByParityIITest {

    @Test
    public void sortArrayByParityII() {
        assertArrayEquals(new int[]{4, 5, 2, 3, 6}, new SortArrayByParityII().sortArrayByParityII(new int[]{3, 5, 2, 4, 6}));
    }
}