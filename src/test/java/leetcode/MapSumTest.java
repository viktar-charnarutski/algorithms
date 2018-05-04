package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapSumTest {

    @Test
    public void sum() {
        MapSum ins = new MapSum();
        ins.insert("apple", 3);
        ins.insert("application", 2);
        ins.insert("apply", 1);
        ins.insert("appnrt", 4);
        assertEquals(6, ins.sum("appl"));
        assertEquals(10, ins.sum("app"));
    }
}