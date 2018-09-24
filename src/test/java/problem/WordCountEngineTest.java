package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordCountEngineTest {

    @Test
    public void wordCountEngine() {
        String[][] expected = {
                {"practice", "3"},
                {"perfect", "2"},
                {"makes", "1"},
                {"youll", "1"},
                {"only", "1"},
                {"get", "1"},
                {"by", "1"},
                {"just", "1"}};

        String[][] ectual = WordCountEngine.wordCountEngine(
                "Practice makes perfect. you'll only get Perfect by practice. just practice!");

        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(ectual[i], expected[i]);
        }
    }
}