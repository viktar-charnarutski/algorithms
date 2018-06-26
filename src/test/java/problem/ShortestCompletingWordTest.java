package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestCompletingWordTest {

    @Test
    public void shortestCompletingWord1() {
        ShortestCompletingWord ins = new ShortestCompletingWord();
        assertEquals("steps", ins.shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));
    }
    @Test
    public void shortestCompletingWord2() {
        ShortestCompletingWord ins = new ShortestCompletingWord();
        assertEquals("pest", ins.shortestCompletingWord("1s3 456", new String[]{"looks", "pest", "stew", "show"}));
    }
    @Test
    public void shortestCompletingWord3() {
        ShortestCompletingWord ins = new ShortestCompletingWord();
        assertEquals("husband", ins.shortestCompletingWord("Ah71752", new String[]{"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"}));
    }
}