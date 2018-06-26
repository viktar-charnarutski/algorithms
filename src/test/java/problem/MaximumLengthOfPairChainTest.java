package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumLengthOfPairChainTest {

    @Test
    public void findLongestChain() {
        MaximumLengthOfPairChain ins = new MaximumLengthOfPairChain();
        int[][] in = new int[3][2];
        in[0][0] = 1;
        in[0][1] = 2;
        in[1][0] = 2;
        in[1][1] = 3;
        in[2][0] = 3;
        in[2][1] = 4;
        assertEquals(2, ins.findLongestChain(in));
    }
}