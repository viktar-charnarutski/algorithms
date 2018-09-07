package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CombinationsAndPermutationsTest {

    @Test
    public void getCombPerms() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("c");
        expected.add("ca");
        expected.add("car");
        expected.add("cr");
        expected.add("cra");
        expected.add("a");
        expected.add("ac");
        expected.add("acr");
        expected.add("ar");
        expected.add("arc");
        expected.add("r");
        expected.add("rc");
        expected.add("rca");
        expected.add("ra");
        expected.add("rac");
        assertEquals(expected, CombinationsAndPermutations.getCombPerms("car"));
    }
}