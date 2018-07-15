package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsTest {

    @Test
    public void uniquePathsTest() {
        assertEquals(3, new UniquePaths().uniquePaths(3, 2));
    }
}