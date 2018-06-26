package problem;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class LetterCasePermutationTest {
    private LetterCasePermutation ins = new LetterCasePermutation();

    @Test
    public void letterCasePermutation() {
        assertEquals(Arrays.asList("A1B2", "A1b2", "a1B2", "a1b2"), ins.letterCasePermutation("a1b2"));
        assertEquals(Collections.singletonList(""), ins.letterCasePermutation(""));
        assertEquals(Arrays.asList("3Z4", "3z4"), ins.letterCasePermutation("3z4"));
        assertEquals(Collections.singletonList("12345"), ins.letterCasePermutation("12345"));
        assertEquals(Arrays.asList( "MQE", "MQe", "MqE", "Mqe", "mQE", "mQe", "mqE", "mqe"), ins.letterCasePermutation("mQe"));
    }
}