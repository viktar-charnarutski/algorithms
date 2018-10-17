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

    @Test
    public void gridSearch2() {
        String[] grid = {"7283455864",
                "6731158619",
                "8988242643",
                "3830589324",
                "2229505813",
                "5633845374",
                "6473530293",
                "7053106601",
                "0834282956",
                "4607924137" };

        String[] pattern = {"9505",
                "3845",
                "3530" };

        assertEquals("YES", TheGridSearch.gridSearch(grid, pattern));
    }

}