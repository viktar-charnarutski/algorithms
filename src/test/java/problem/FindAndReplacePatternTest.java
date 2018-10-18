package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindAndReplacePatternTest {

    @Test
    public void findAndReplacePattern1() {
        assertEquals(Arrays.asList("mee", "aqq"), new FindAndReplacePattern().findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc" }, "abb"));
    }

    @Test
    public void findAndReplacePattern2() {
        assertEquals(Arrays.asList("abab", "dede"), new FindAndReplacePattern().findAndReplacePattern(new String[]{"badc", "abab", "dddd", "dede", "yyxx" }, "baba"))
        ;
    }
}