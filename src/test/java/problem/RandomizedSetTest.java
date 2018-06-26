package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomizedSetTest {

    @Test
    public void insert() {
        RandomizedSet ins = new RandomizedSet();
        assertTrue(ins.insert(1));
        assertFalse(ins.insert(1));
        assertEquals(1, ins.getRandom());
    }

    @Test
    public void remove1() {
        RandomizedSet ins = new RandomizedSet();
        ins.insert(1);
        ins.insert(2);
        assertTrue(ins.remove(2));
        assertFalse(ins.remove(2));
        assertEquals(1, ins.getRandom());
    }

    @Test
    public void getRandom1() {
        RandomizedSet ins = new RandomizedSet();
        ins.insert(1);
        assertEquals(1, ins.getRandom());
    }

    @Test
    public void getRandom2() {
        RandomizedSet ins = new RandomizedSet();
        ins.insert(-1);
        ins.remove(-2);
        ins.insert(-2);
        ins.remove(-1);
        ins.insert(-2);
        assertEquals(-2, ins.getRandom());
    }
}