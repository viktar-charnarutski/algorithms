package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StringPermutationTest {

    @Test
    public void getPermutations1() {
        List<String> expected = new ArrayList<>();
        expected.add("car");
        expected.add("cra");
        expected.add("acr");
        expected.add("arc");
        expected.add("rac");
        expected.add("rca");
        assertEquals(expected, new StringPermutation().getPermutations("car"));
    }
}