package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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