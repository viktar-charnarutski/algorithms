package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindAndReplacePatternTest {

    @Test
    public void findAndReplacePattern() {
        assertEquals(Arrays.asList("mee", "aqq"), new FindAndReplacePattern().findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc" }, "abb"));
    }
}