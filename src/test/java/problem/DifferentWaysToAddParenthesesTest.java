package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DifferentWaysToAddParenthesesTest {

    @Test
    public void diffWaysToCompute1() {
        ArrayList<Integer> exp = new ArrayList<>();
        exp.add(2);
        exp.add(0);
        assertEquals(exp, new DifferentWaysToAddParentheses().diffWaysToCompute("2-1-1"));
    }

    @Test
    public void diffWaysToCompute2() {
        ArrayList<Integer> exp = new ArrayList<>();
        exp.add(-34);
        exp.add(-10);
        exp.add(-14);
        exp.add(-10);
        exp.add(10);
        assertEquals(exp, new DifferentWaysToAddParentheses().diffWaysToCompute("2*3-4*5"));
    }
}