package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomizedSetTest {

    @Test
    public void insert() {
        RandomizedSet ins = new RandomizedSet();
        ins.insert(1);
        assertEquals(1, ins.getRandom());
    }

    @Test
    public void remove() {
        RandomizedSet ins = new RandomizedSet();
        ins.insert(1);
        ins.insert(2);
        ins.remove(2);
        assertEquals(1, ins.getRandom());
    }

    @Test
    public void getRandom() {
        RandomizedSet ins = new RandomizedSet();
        ins.insert(1);
        ins.insert(2);
        assertEquals(1, ins.getRandom());
    }
}