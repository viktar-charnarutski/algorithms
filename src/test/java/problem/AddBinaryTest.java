package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class AddBinaryTest {

    @Test
    public void addBinary() {
        AddBinary ins = new AddBinary();

        assertEquals("100", ins.addBinary("11", "1"));
        assertEquals("101", ins.addBinary("11", "10"));
    }
}