package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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

    /**
     * If there is no possible result, return the empty string.
     */
    @Test
    public void findLongestWord3() {
        List<String> list = new ArrayList<>();
        list.add("ppprrr");
        list.add("rrppp");
        list.add("qqqp");
        list.add("ooooommm");
        assertEquals("", new LongestWordInDictionaryThroughDeleting().findLongestWord("abpcplea", list));
    }

    /**
     * If there are more than one possible results, return the longest word with the smallest lexicographical order.
     */
    @Test
    public void findLongestWord4() {
        List<String> list = new ArrayList<>();
        list.add("ale");
        list.add("apple");
        list.add("appla");
        list.add("monkey");
        list.add("plea");
        assertEquals("appla", new LongestWordInDictionaryThroughDeleting().findLongestWord("abpcplea", list));
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

    @Test
    public void check() {
        int[] target = new int[26];
        target[0] = 2;
        target[1] = 3;
        target[2] = 4;
        target[4] = 5;
        target[6] = 10;

        int[] variant = new int[26];
        variant[0] = 2;
        variant[1] = 3;
        variant[2] = 4;
        variant[4] = 5;
        assertTrue(new LongestWordInDictionaryThroughDeleting().check(variant, target));
    }

    @Test
    public void smallestLexicoOrder() {
        assertEquals("abcd", new LongestWordInDictionaryThroughDeleting().smallestLexicoOrder("abcd", "abce"));
    }
}