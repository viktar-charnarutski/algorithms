package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class EvaluateReversePolishNotationTest {

    @Test
    public void evalRPN1() {
        assertEquals(9, new EvaluateReversePolishNotation().evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    public void evalRPN2() {
        assertEquals(6, new EvaluateReversePolishNotation().evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    public void evalRPN3() {
        assertEquals(12.5, new EvaluateReversePolishNotation().rpn(Arrays.asList("4", "1", "+", "2.5", "*")), 0.0);
    }
}