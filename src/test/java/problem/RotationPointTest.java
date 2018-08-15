package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotationPointTest {

    @Test
    public void findRotationPoint1() {
        String[] words = {"ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "asymptote",
                "babka",
                "banoffee",
                "engender",
                "karpatkav",
                "othellolagkage"};

        assertEquals(5, new RotationPoint().findRotationPoint(words));
    }

    @Test
    public void findRotationPoint2() {
        String[] words = {
                "asymptote",
                "babka",
                "banoffee",
                "engender",
                "karpatkav",
                "othellolagkage",
                "ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist"};

        assertEquals(0, new RotationPoint().findRotationPoint(words));
    }
}