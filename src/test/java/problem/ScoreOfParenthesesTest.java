package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreOfParenthesesTest {

    @Test
    public void scoreOfParentheses1() {
        assertEquals(1, new ScoreOfParentheses().scoreOfParentheses("()"));
    }

    @Test
    public void scoreOfParentheses2() {
        assertEquals(2, new ScoreOfParentheses().scoreOfParentheses("()()"));
    }

    @Test
    public void scoreOfParentheses3() {
        assertEquals(4, new ScoreOfParentheses().scoreOfParentheses("(()())"));
    }
}