package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LongestWordInDictionaryThroughDeletingTest {

    @Test
    public void findLongestWord1() {
        List<String> list = new ArrayList<>();
        list.add("ale");
        list.add("apple");
        list.add("monkey");
        list.add("plea");
        assertEquals("apple", new LongestWordInDictionaryThroughDeleting().findLongestWord("abpcplea", list));
    }

    @Test
    public void findLongestWord2() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a", new LongestWordInDictionaryThroughDeleting().findLongestWord("abpcplea", list));
    }

    @Test
    public void occurrence() {
        int[] occ = new int[26];
        occ[0] = 2;
        occ[1] = 3;
        occ[2] = 4;
        occ[4] = 5;

        assertArrayEquals(occ, new LongestWordInDictionaryThroughDeleting().occurrence("aabbbcccceeeee"));
    }
}