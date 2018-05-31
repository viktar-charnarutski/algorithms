package leetcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LexicographicalNumbersTest {

    @Test
    public void lexicalOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        assertEquals(list, new LexicographicalNumbers().lexicalOrder(13));
    }
}