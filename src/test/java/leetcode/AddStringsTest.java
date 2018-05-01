package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddStringsTest {

    @Test
    public void addStrings() {
        AddStrings ins = new AddStrings();
        assertEquals("579", ins.addStrings("123", "456"));
        assertEquals("581", ins.addStrings("123", "458"));
        assertEquals("2110", ins.addStrings("999", "1111"));
        assertEquals("1001000", ins.addStrings("999", "1000001"));
        assertEquals("", ins.addStrings("", ""));
    }
}