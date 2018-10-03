package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class CakeThiefTest {

    @Test
    public void maxDuffelBagValue() {
        CakeThief.CakeType[] cakes = {
                new CakeThief.CakeType(7, 160),
                new CakeThief.CakeType(3, 90),
                new CakeThief.CakeType(2, 15)
        };
        assertEquals(555, CakeThief.maxDuffelBagValue(cakes, 20));
    }
}