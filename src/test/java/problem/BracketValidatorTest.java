package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BracketValidatorTest {

    @Test
    public void isValid1() {
        assertTrue(new BracketValidator().isValid("{[]()}"));
    }

    @Test
    public void isValid2() {
        assertFalse(new BracketValidator().isValid("{[(])}"));
    }

    @Test
    public void isValid3() {
        assertFalse(new BracketValidator().isValid("{[}"));
    }
}