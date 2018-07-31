package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StickersToSpellWordTest {

    @Test
    public void minStickers1() {
        assertEquals(3, new StickersToSpellWord().minStickers(new String[]{"with", "example", "science"}, "thehat"));
    }

    @Test
    public void minStickers2() {
        assertEquals(-1, new StickersToSpellWord().minStickers(new String[]{"notice", "possible"}, "basicbasic"));
    }
}