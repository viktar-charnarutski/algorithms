package leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class RelativeRanksTest {

    @Test
    public void findRelativeRanks() {
        RelativeRanks ins = new RelativeRanks();
        String[] output = ins.findRelativeRanks(new int[]{5, 4, 3, 2, 1});
        System.out.println(Arrays.toString(output));
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"},
                output);

        assertArrayEquals(new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"},
                ins.findRelativeRanks(new int[]{10, 3, 8, 9, 4}));

    }
}