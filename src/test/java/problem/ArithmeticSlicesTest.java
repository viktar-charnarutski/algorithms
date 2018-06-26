package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticSlicesTest {

    @Test
    public void numberOfArithmeticSlices() {
        ArithmeticSlices ins = new ArithmeticSlices();
        assertEquals(3, ins.numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void numberOfArithmeticSlices_same_elements() {
        ArithmeticSlices ins = new ArithmeticSlices();
        assertEquals(3, ins.numberOfArithmeticSlices(new int[]{7, 7, 7, 7}));
    }

    @Test
    public void numberOfArithmeticSlices_negative_elements() {
        ArithmeticSlices ins = new ArithmeticSlices();
        assertEquals(3, ins.numberOfArithmeticSlices(new int[]{3, -1, -5, -9}));
    }

    @Test
    public void numberOfArithmeticSlices_three_elements() {
        ArithmeticSlices ins = new ArithmeticSlices();
        assertEquals(1, ins.numberOfArithmeticSlices(new int[]{3, -1, -5}));
    }

    @Test
    public void numberOfArithmeticSlices_two_elements() {
        ArithmeticSlices ins = new ArithmeticSlices();
        assertEquals(0, ins.numberOfArithmeticSlices(new int[]{3, -1}));
    }
}