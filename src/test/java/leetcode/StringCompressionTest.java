package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class StringCompressionTest {

    @Test
    public void compress() {
        StringCompression ins = new StringCompression();

        assertTrue(6 == ins.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        assertTrue(3 == ins.compress(new char[]{'a', 'b', 'c'}));
        assertTrue(1 == ins.compress(new char[]{'a'}));
        assertTrue(4 == ins.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
        assertTrue(0 == ins.compress(new char[]{}));
    }
}