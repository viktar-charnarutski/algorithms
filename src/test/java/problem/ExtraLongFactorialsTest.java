package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExtraLongFactorialsTest {

    @Test
    public void extraLongFactorials() {
        assertEquals("265252859812191058636308480000000", ExtraLongFactorials.extraLongFactorials(30));
    }
}