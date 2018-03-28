package strings.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class ValidParenthesesTest {

    @Test
    public void isValid() {
        ValidParentheses ins = new ValidParentheses();

        assertTrue(ins.isValid("()[]{}"));
        assertTrue(ins.isValid("([{}])"));
        assertTrue(ins.isValid("([{([{([{}])}])}])"));
        assertFalse(ins.isValid("(]"));
        assertFalse(ins.isValid("([{([{([{}])}])}])))))"));
    }
}