package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvaluateReversePolishNotationTest {

    @Test
    public void evalRPN1() {
        assertEquals(9, new EvaluateReversePolishNotation().evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }
}