package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PseudoIsomorphicSubstringsTest {

    @Test
    public void pseudoIsomorphicSubstrings1() {
        assertArrayEquals(new int[]{1, 2, 3}, PseudoIsomorphicSubstrings.pseudoIsomorphicSubstrings("abc"));
    }

    @Test
    public void pseudoIsomorphicSubstrings2() {
        int[] res = PseudoIsomorphicSubstrings.pseudoIsomorphicSubstrings("abbabab");
        System.out.println(Arrays.toString(res));
        assertArrayEquals(new int[]{1, 2, 4, 6, 9, 12, 15}, res);
    }

    @Test
    public void hash() {
        assertEquals("0:3:5-1:2:4:6-1:2:4:6-0:3:5-1:2:4:6-0:3:5-1:2:4:6-", PseudoIsomorphicSubstrings.hash("abbabab"));
    }
}