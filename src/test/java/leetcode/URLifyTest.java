package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class URLifyTest {

    @Test
    public void urlify() {
        assertEquals("Mr%20John%20Smith", new URLify().urlify("Mr John Smith    "));
    }
}