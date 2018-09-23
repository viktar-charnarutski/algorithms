package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BusiestTimeInTheMallTest {

    @Test
    public void findBusiestPeriod1() {
        int[][] data = {
                {1487799425, 14, 1},
                {1487799425, 4, 0},
                {1487799425, 2, 0},
                {1487800378, 10, 1},
                {1487801478, 18, 0},
                {1487801478, 18, 1},
                {1487901013, 1, 0},
                {1487901211, 7, 1},
                {1487901211, 7, 0}
        };
        assertEquals(1487800378, new BusiestTimeInTheMall().findBusiestPeriod(data));
    }
}