package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongPressedNameTest {

    @Test
    public void isLongPressedName1() {
        assertTrue(new LongPressedName().isLongPressedName("alex", "aaleex"));
    }

    @Test
    public void isLongPressedName2() {
        assertFalse(new LongPressedName().isLongPressedName("saeed", "ssaaedd"));
    }

    @Test
    public void isLongPressedName3() {
        assertTrue(new LongPressedName().isLongPressedName("leelee", "lleeelee"));
    }

    @Test
    public void isLongPressedName4() {
        assertTrue(new LongPressedName().isLongPressedName("laiden", "laiden"));
    }

    @Test
    public void isLongPressedName5() {
        assertFalse(new LongPressedName().isLongPressedName("pyplrz", "ppyypllr"));
    }

    @Test
    public void isLongPressedName6() {
        assertTrue(new LongPressedName().isLongPressedName("vtkgn", "vttkgnn"));
    }
}