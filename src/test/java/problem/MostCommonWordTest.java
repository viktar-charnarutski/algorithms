package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostCommonWordTest {

    @Test
    public void mostCommonWord1() {
        assertEquals("ball", new MostCommonWord().mostCommonWord(
                "Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }

    @Test
    public void mostCommonWord2() {
        assertEquals("ball", new MostCommonWord().mostCommonWord(
                "Bob hit a ball, the hit BALL flew far after it was hit. And then Bob" +
                        " decided to get home. It was too late, and Bob didn't want to be late.", new String[]{"hit"}));
    }
}