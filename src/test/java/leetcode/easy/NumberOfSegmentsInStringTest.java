package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class NumberOfSegmentsInStringTest {

    @Test
    public void countSegments() {
        NumberOfSegmentsInString ins = new NumberOfSegmentsInString();
        assertTrue(5 == ins.countSegments("Hello, my name is John"));
        assertTrue(0 == ins.countSegments(""));
        assertTrue(6 == ins.countSegments(", , , ,        a, eaefa"));
    }
}