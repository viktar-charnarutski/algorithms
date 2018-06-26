package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindPeakElementTest {

    @Test
    public void findPeakElement1() {
        assertEquals(2, new FindPeakElement().findPeakElement(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void findPeakElement2() {
        assertEquals(1, new FindPeakElement().findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

    @Test
    public void findPeakElement3() {
        assertEquals(2, new FindPeakElement().findPeakElement(new int[]{1, 2, 3}));
    }

    @Test
    public void findPeakElement4() {
        assertEquals(0, new FindPeakElement().findPeakElement(new int[]{1}));
    }

    @Test
    public void findPeakElement5() {
        assertEquals(1, new FindPeakElement().findPeakElement(new int[]{1, 2}));
    }

    @Test
    public void findPeakElement6() {
        assertEquals(1, new FindPeakElement().findPeakElement(new int[]{1, 3, 2, 1}));
    }
}