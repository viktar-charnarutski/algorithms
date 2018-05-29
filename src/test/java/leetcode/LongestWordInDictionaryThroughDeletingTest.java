package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void findLongestWord5() {
        List<String> list = new ArrayList<>();
        list.add("ewaf");
        list.add("apple");
        list.add("awefawfwaf");
        list.add("awef");
        list.add("awefe");
        list.add("ewafeffewafewf");
        assertEquals("ewaf", new LongestWordInDictionaryThroughDeleting().findLongestWord("aewfafwafjlwajflwajflwafj", list));
    }
}