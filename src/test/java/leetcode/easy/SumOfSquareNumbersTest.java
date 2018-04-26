package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SumOfSquareNumbersTest {

    @Test
    public void judgeSquareSum_true() {
        SumOfSquareNumbers ins = new SumOfSquareNumbers();
        assertTrue(ins.judgeSquareSum(5));
        assertTrue(ins.judgeSquareSum(8));
    }
}