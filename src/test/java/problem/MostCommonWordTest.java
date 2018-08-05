package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostCommonWordTest {

    @Test
    public void mostCommonWord() {
        assertEquals("ball", new MostCommonWord().mostCommonWord(
                "Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }
}