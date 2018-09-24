package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordCountEngineTest {

    @Test
    public void wordCountEngine1() {
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

    @Test
    public void wordCountEngine2() {
        String[][] expected = {
                {"and", "4"},
                {"every", "3"},
                {"is", "3"},
                {"a", "3"},
                {"quotation", "3"},
                {"all", "2"},
                {"book", "1"},
                {"house", "1"},
                {"out", "1"},
                {"of", "1"},
                {"forests", "1"},
                {"mines", "1"},
                {"stone", "1"},
                {"quarries", "1"},
                {"man", "1"},
                {"from", "1"},
                {"his", "1"},
                {"ancestors", "1"}};

        String[][] ectual = WordCountEngine.wordCountEngine(
                "Every book is a quotation; and every house is a quotation out of all forests, and mines, and stone quarries; and every man is a quotation from all his ancestors. ");

        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(ectual[i], expected[i]);
        }
    }

    @Test
    public void normalize() {
        assertEquals("practice makes perfect youll only get perfect by practice just practice",
                WordCountEngine.normalize("Practice makes perfect. you'll only get Perfect by practice. just practice!"));
    }
}