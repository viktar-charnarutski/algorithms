package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringPermutationTest {

    @Test
    public void getPermutations1() {
        List<String> expected = new ArrayList<>();
        expected.add("car");
        expected.add("cra");
        expected.add("acr");
        expected.add("arc");
        expected.add("rca");
        expected.add("rac");
        assertEquals(expected, new StringPermutation().getPermutations("car"));
    }

    @Test
    public void getPermutations2() {
        assertEquals(Collections.emptyList(), new StringPermutation().getPermutations(""));
    }

    @Test
    public void getPermutations3() {
        assertNull(new StringPermutation().getPermutations(null));
    }
}