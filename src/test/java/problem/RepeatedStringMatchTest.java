package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class RepeatedStringMatchTest {

    @Test
    public void repeatedStringMatch() {
        RepeatedStringMatch ins = new RepeatedStringMatch();

        assertTrue(3 == ins.repeatedStringMatch("abcd", "cdabcdab"));
        assertTrue(1 == ins.repeatedStringMatch("aa", "a"));
        assertTrue(1 == ins.repeatedStringMatch("aaaa", "a"));
    }
}