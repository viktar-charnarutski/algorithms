package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitIntoBasketsTest {

    @Test
    public void totalFruit1() {
        assertEquals(3, new FruitIntoBaskets().totalFruit(new int[]{1, 2, 1}));
    }

    @Test
    public void totalFruit2() {
        assertEquals(3, new FruitIntoBaskets().totalFruit(new int[]{0, 1, 2, 2}));
    }
}