package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsomorphicStringsTest {

    @Test
    public void isIsomorphic1() {
        assertTrue(new IsomorphicStrings().isIsomorphic("egg", "add"));
    }

    @Test
    public void isIsomorphic2() {
        assertFalse(new IsomorphicStrings().isIsomorphic("foo", "bar"));
    }

    @Test
    public void isIsomorphic3() {
        assertTrue(new IsomorphicStrings().isIsomorphic("paper", "title"));
    }
}