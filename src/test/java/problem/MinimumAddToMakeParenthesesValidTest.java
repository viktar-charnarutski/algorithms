package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumAddToMakeParenthesesValidTest {

    @Test
    public void minAddToMakeValid1() {
        assertEquals(1, new MinimumAddToMakeParenthesesValid().minAddToMakeValid("())"));
    }

    @Test
    public void minAddToMakeValid2() {
        assertEquals(3, new MinimumAddToMakeParenthesesValid().minAddToMakeValid("((("));
    }

    @Test
    public void minAddToMakeValid3() {
        assertEquals(0, new MinimumAddToMakeParenthesesValid().minAddToMakeValid("()"));
    }

}