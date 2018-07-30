package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RepeatedDnaSequencesTest {

    @Test
    public void findRepeatedDnaSequences() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("AAAAACCCCC");
        expected.add("CCCCCAAAAA");
        assertEquals(expected, new RepeatedDnaSequences().findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }
}