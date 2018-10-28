package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseOnlyLettersTest {

    @Test
    public void reverseOnlyLetters1() {
        assertEquals("dc-ba", new ReverseOnlyLetters().reverseOnlyLetters("ab-cd"));
    }

    @Test
    public void reverseOnlyLetters2() {
        assertEquals("j-Ih-gfE-dCba", new ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}