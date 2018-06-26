package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TopKFrequentElementsTest {

    @Test
    public void topKFrequent() {
        TopKFrequentElements ins = new TopKFrequentElements();
        ArrayList<Integer> out = new ArrayList<>();
        out.add(1);
        out.add(2);
        assertEquals(out, ins.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }
    @Test
    public void topKFrequent1() {
        TopKFrequentElements ins = new TopKFrequentElements();
        ArrayList<Integer> out = new ArrayList<>();
        out.add(1);
        out.add(2);
        assertEquals(out, ins.topKFrequent(new int[]{1, 2}, 2));
    }
}