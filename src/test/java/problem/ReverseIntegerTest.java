package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void reverse_positive() {
        ReverseInteger ins = new ReverseInteger();
        assertEquals(321, ins.reverse(123));
    }

    @Test
    public void reverse_negative() {
        ReverseInteger ins = new ReverseInteger();
        assertEquals(-321, ins.reverse(-123));
    }
}