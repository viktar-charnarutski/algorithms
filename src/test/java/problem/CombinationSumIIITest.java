package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationSumIIITest {

    @Test
    public void combinationSum3_1() {
        List<List<Integer>> input = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        res1.add(1);
        res1.add(2);
        res1.add(4);
        input.add(res1);
        assertEquals(input, new CombinationSumIII().combinationSum3(3, 7));
    }

    @Test
    public void combinationSum3_2() {
        List<List<Integer>> input = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        res1.add(1);
        res1.add(2);
        res1.add(6);
        input.add(res1);
        List<Integer> res2 = new ArrayList<>();
        res2.add(1);
        res2.add(3);
        res2.add(5);
        input.add(res2);
        List<Integer> res3 = new ArrayList<>();
        res3.add(2);
        res3.add(3);
        res3.add(4);
        input.add(res3);
        assertEquals(input, new CombinationSumIII().combinationSum3(3, 9));
    }

    @Test
    public void combinationSum3_3() {
        List<List<Integer>> input = new ArrayList<>();
        assertEquals(input, new CombinationSumIII().combinationSum3(2, 18));
    }
}