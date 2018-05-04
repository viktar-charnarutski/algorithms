package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortCharactersByFrequencyTest {

    @Test
    public void frequencySort() {
        SortCharactersByFrequency ins = new SortCharactersByFrequency();
        assertEquals("eert", ins.frequencySort("tree"));
    }

    @Test
    public void frequencySort1() {
        SortCharactersByFrequency ins = new SortCharactersByFrequency();
        assertEquals("aaaccc", ins.frequencySort("cccaaa"));
    }

    @Test
    public void frequencySort2() {
        SortCharactersByFrequency ins = new SortCharactersByFrequency();
        assertEquals("bbAa", ins.frequencySort("Aabb"));
    }
}