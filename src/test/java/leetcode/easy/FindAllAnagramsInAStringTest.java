package leetcode.easy;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FindAllAnagramsInAStringTest {

    @Test
    public void findAnagrams_abcebaabcd() {
        FindAllAnagramsInAString ins = new FindAllAnagramsInAString();
        ArrayList<Object> expected1 = new ArrayList<>();
        expected1.add(0);
        expected1.add(6);
        assertEquals(expected1, ins.findAnagrams("abcebaabcd", "abc"));

    }

    @Test
    public void findAnagrams_cbaebabacd() {
        FindAllAnagramsInAString ins = new FindAllAnagramsInAString();
        ArrayList<Object> expected1 = new ArrayList<>();
        expected1.add(0);
        expected1.add(6);
        assertEquals(expected1, ins.findAnagrams("cbaebabacd", "abc"));

    }    @Test
    public void findAnagrams_abab() {
        FindAllAnagramsInAString ins = new FindAllAnagramsInAString();
        ArrayList<Object> expected2 = new ArrayList<>();
        expected2.add(0);
        expected2.add(1);
        expected2.add(2);
        assertEquals(expected2, ins.findAnagrams("abab", "ab"));

    }
}