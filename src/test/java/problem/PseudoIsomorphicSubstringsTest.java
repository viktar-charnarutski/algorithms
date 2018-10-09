package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoIsomorphicSubstringsTest {

    @Test
    public void pseudoIsomorphicSubstrings() {
        assertArrayEquals(new int[]{1, 2, 4, 6, 9, 12, 15}, PseudoIsomorphicSubstrings.pseudoIsomorphicSubstrings("abbabab"));
    }
}