package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PerfectNumberTest {

    @Test
    public void checkPerfectNumber_true() {
        PerfectNumber ins = new PerfectNumber();
        assertTrue(ins.checkPerfectNumber(28));
    }

    @Test
    public void checkPerfectNumber_false() {
        PerfectNumber ins = new PerfectNumber();
        assertFalse(ins.checkPerfectNumber(27));
    }
}