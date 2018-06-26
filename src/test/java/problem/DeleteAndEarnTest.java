package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteAndEarnTest {

    @Test
    public void deleteAndEarn1() {
        assertEquals(6, new DeleteAndEarn().deleteAndEarn(new int[]{3, 4, 2}));
    }

    @Test
    public void deleteAndEarn2() {
        assertEquals(9, new DeleteAndEarn().deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }
}