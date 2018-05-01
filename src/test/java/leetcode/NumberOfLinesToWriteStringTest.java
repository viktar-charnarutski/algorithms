package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumberOfLinesToWriteStringTest {

    @Test
    public void numberOfLines() {
        NumberOfLinesToWriteString ins = new NumberOfLinesToWriteString();

        assertArrayEquals(new int[]{3, 60}, ins.numberOfLines(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "abcdefghijklmnopqrstuvwxyz"));
        assertArrayEquals(new int[]{2, 4}, ins.numberOfLines(new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "bbbcccdddaaa"));
        assertArrayEquals(new int[]{1, 10}, ins.numberOfLines(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "a"));
        assertArrayEquals(new int[]{1, 0}, ins.numberOfLines(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, ""));
        assertArrayEquals(new int[]{1, 46}, ins.numberOfLines(new int[]{5, 7, 4, 7, 6, 7, 9, 5, 8, 8, 5, 10, 9, 10, 2, 5, 7, 9, 3, 8, 8, 8, 10, 2, 2, 9}, "lgrnv"));
    }
}