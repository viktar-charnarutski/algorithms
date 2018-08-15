package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotationPointTest {

    @Test
    public void findRotationPoint() {
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
}