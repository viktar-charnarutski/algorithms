package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RepeatedDnaSequencesTest {

    @Test
    public void findRepeatedDnaSequences1() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("AAAAACCCCC");
        expected.add("CCCCCAAAAA");
        assertEquals(expected, new RepeatedDnaSequences().findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

    @Test
    public void findRepeatedDnaSequences2() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("AAAAAAAAAA");
        assertEquals(expected, new RepeatedDnaSequences().findRepeatedDnaSequences("AAAAAAAAAAA"));
    }

    @Test
    public void findRepeatedDnaSequences3() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("AAAAAAAAAA");
        assertEquals(expected, new RepeatedDnaSequences().findRepeatedDnaSequences("AAAAAAAAAAAA"));
    }
}