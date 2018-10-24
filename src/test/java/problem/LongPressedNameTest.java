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
}