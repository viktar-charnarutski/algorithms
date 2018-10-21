package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreOfParenthesesTest {

    @Test
    public void scoreOfParentheses1() {
        assertEquals(1, new ScoreOfParentheses().scoreOfParentheses("()"));
    }
}