package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertStarsTest {

    @Test
    public void insertPairStar1() {
        assertEquals("a*aba", new InsertStars().insertPairStar("aaba"));
    }

    @Test
    public void insertPairStar2() {
        assertEquals("a", new InsertStars().insertPairStar("a"));
    }
}