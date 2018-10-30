package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyStringsTest {

    @Test
    public void multiply1() {
        assertEquals("6", new MultiplyStrings().multiply("3", "2"));
    }
}