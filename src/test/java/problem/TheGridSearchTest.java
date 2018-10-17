package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheGridSearchTest {

    @Test
    public void gridSearch1() {
        String[] grid = {"1234567890",
                "0987654321",
                "1111111111",
                "1111111111",
                "2222222222" };

        String[] pattern = {"876543",
                "111111",
                "111111" };

        assertEquals("YES", TheGridSearch.gridSearch(grid, pattern));
    }
}