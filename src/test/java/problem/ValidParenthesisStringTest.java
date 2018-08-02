package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesisStringTest {

    @Test
    public void checkValidString1() {
        assertTrue(new ValidParenthesisString().checkValidString("()"));
    }

    @Test
    public void checkValidString2() {
        assertTrue(new ValidParenthesisString().checkValidString("(*)"));
    }

    @Test
    public void checkValidString3() {
        assertTrue(new ValidParenthesisString().checkValidString("(*))"));
    }

    @Test
    public void checkValidString4() {
        assertFalse(new ValidParenthesisString().checkValidString("(*)))"));
    }

    @Test
    public void checkValidString5() {
        assertTrue(new ValidParenthesisString().checkValidString("((*))"));
    }

    @Test
    public void checkValidString6() {
        assertFalse(new ValidParenthesisString().checkValidString("())"));
    }

    @Test
    public void checkValidString7() {
        assertFalse(new ValidParenthesisString().checkValidString("((())"));
    }

    @Test
    public void checkValidString8() {
        assertTrue(new ValidParenthesisString().checkValidString("((((()()))))"));
    }

    @Test
    public void checkValidString9() {
        assertFalse(new ValidParenthesisString().checkValidString("((((()())))"));
    }

    @Test
    public void checkValidString10() {
        assertFalse(new ValidParenthesisString().checkValidString("((((()())))"));
    }

    @Test
    public void checkValidString11() {
        assertFalse(new ValidParenthesisString().checkValidString("(*)))"));
    }

    @Test
    public void checkValidString12() {
        assertTrue(new ValidParenthesisString().checkValidString("(((******))"));
    }
}