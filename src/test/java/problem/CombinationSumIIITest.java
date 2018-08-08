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
}