package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleElementInASortedArrayTest {

    @Test
    public void singleNonDuplicate() {
        SingleElementInASortedArray ins = new SingleElementInASortedArray();
        assertEquals(2, ins.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
    }

    @Test
    public void singleNonDuplicate1() {
        SingleElementInASortedArray ins = new SingleElementInASortedArray();
        assertEquals(10, ins.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
    }

    @Test
    public void singleNonDuplicate_three_elements_single_last() {
        SingleElementInASortedArray ins = new SingleElementInASortedArray();
        assertEquals(7, ins.singleNonDuplicate(new int[]{3, 3, 7}));
    }

    @Test
    public void singleNonDuplicate_three_elements_single_first() {
        SingleElementInASortedArray ins = new SingleElementInASortedArray();
        assertEquals(3, ins.singleNonDuplicate(new int[]{3, 7, 7}));
    }

    @Test
    public void singleNonDuplicate_one_element() {
        SingleElementInASortedArray ins = new SingleElementInASortedArray();
        assertEquals(1, ins.singleNonDuplicate(new int[]{1}));
    }
}