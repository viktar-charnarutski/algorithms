package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CombinationsAndPermutationsTest {

    @Test
    public void getCombPerms() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("car");
        expected.add("cra");
        expected.add("rca");
        expected.add("rac");
        expected.add("acr");
        expected.add("arc");
        expected.add("c");
        expected.add("a");
        expected.add("r");
        expected.add("ca");
        expected.add("ac");
        expected.add("ar");
        expected.add("ra");
        expected.add("cr");
        expected.add("rc");
        assertEquals(expected, CombinationsAndPermutations.getCombPerms("car"));
    }
}