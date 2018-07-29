package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueBinarySearchTreesTest {

    @Test
    public void numTrees() {
        assertEquals(5, new UniqueBinarySearchTrees().numTrees(3));
    }
}