package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomSortStringTest {

    @Test
    public void customSortString() {
        CustomSortString ins = new CustomSortString();
        assertEquals("cbad", ins.customSortString("cba", "abcd"));
    }
}