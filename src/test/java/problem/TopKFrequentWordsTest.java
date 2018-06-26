package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TopKFrequentWordsTest {

    @Test
    public void topKFrequent() {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("i");
        strs.add("love");
        assertEquals(strs, new TopKFrequentWords().topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
    }
}