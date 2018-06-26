package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductOfWordLengthsTest {

    @Test
    public void maxProduct1() {
        assertEquals(16, new MaximumProductOfWordLengths().maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
    }
    @Test
    public void maxProduct2() {
        assertEquals(4, new MaximumProductOfWordLengths().maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
    }
    @Test
    public void maxProduct3() {
        assertEquals(0, new MaximumProductOfWordLengths().maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
    }
}