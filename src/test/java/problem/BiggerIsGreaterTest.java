package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BiggerIsGreaterTest {

    @Test
    public void biggerIsGreater1() {
        assertEquals("abdc", BiggerIsGreater.biggerIsGreater("abcd"));
    }
}