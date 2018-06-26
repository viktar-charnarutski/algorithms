package problem;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 *
 */
public class MaxConsecutiveOnesTest {

    @Test
    public void findMaxConsecutiveOnes() {
        MaxConsecutiveOnes ins = new MaxConsecutiveOnes();
        assertTrue(5 == ins.findMaxConsecutiveOnes(new int[]{1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0}));
        assertTrue(1 == ins.findMaxConsecutiveOnes(new int[]{1}));
        assertTrue(0 == ins.findMaxConsecutiveOnes(new int[]{0, 0, 0}));
    }
}