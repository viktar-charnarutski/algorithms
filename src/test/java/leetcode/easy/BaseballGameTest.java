package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseballGameTest {

    @Test
    public void calPoints() {
        BaseballGame ins = new BaseballGame();

        String[] input1 = {"5", "2", "C", "D", "+" };
        String[] input2 = {"5", "-2", "4", "C", "D", "9", "+", "+" };
        String[] input3 = {"-60", "D", "-36", "30", "13", "C", "C", "-33", "53", "79" };

        assertTrue(30 == ins.calPoints(input1));
        assertTrue(27 == ins.calPoints(input2));
        assertTrue(0 == ins.calPoints(new String[0]));
    }
}