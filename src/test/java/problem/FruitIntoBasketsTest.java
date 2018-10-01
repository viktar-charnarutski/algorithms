package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitIntoBasketsTest {

    @Test
    public void totalFruit1() {
        assertEquals(3, new FruitIntoBaskets().totalFruit(new int[]{1, 2, 1}));
    }
}