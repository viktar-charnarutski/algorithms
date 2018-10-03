package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CakeThiefTest {

    @Test
    public void maxDuffelBagValue1() {
        CakeThief.CakeType[] cakes = {
                new CakeThief.CakeType(2, 15),
                new CakeThief.CakeType(7, 160),
                new CakeThief.CakeType(3, 90)
        };
        long actual = CakeThief.maxDuffelBagValue(cakes, 20);
        assertEquals(555, actual);
    }

    @Test
    public void maxDuffelBagValue2() {
        CakeThief.CakeType[] cakes = {
                new CakeThief.CakeType(3, 40),
                new CakeThief.CakeType(5, 70)
        };
        long actual = CakeThief.maxDuffelBagValue(cakes, 8);
        assertEquals(110, actual);
    }

    @Test
    public void maxDuffelBagValue3() {
        CakeThief.CakeType[] cakes = {
                new CakeThief.CakeType(3, 40),
                new CakeThief.CakeType(5, 70)
        };
        long actual = CakeThief.maxDuffelBagValue(cakes, 9);
        assertEquals(120, actual);
    }
}