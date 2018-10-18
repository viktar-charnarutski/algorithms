package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumAddToMakeParenthesesValidTest {

    @Test
    public void minAddToMakeValid1() {
        assertEquals(3, new MinimumAddToMakeParenthesesValid().minAddToMakeValid("())"));
    }
}