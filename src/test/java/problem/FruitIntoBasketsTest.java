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

    @Test
    public void totalFruit3() {
        assertEquals(4, new FruitIntoBaskets().totalFruit(new int[]{1, 2, 3, 2, 2}));
    }

    @Test
    public void totalFruit4() {
        assertEquals(5, new FruitIntoBaskets().totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
    }
}