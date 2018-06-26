package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KeyboardRowTest {

    @Test
    public void findWords() {
        KeyboardRow ins = new KeyboardRow();
        String[] expected = new String[]{"Alaska", "Dad" };
        String[] input = new String[]{"Hello", "Alaska", "Dad", "Peace" };

        assertArrayEquals(expected, ins.findWords(input));
        assertArrayEquals(new String[0], ins.findWords(new String[0]));
    }
}