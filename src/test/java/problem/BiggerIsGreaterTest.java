package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BiggerIsGreaterTest {

    @Test
    public void biggerIsGreater1() {
        assertEquals("abdc", BiggerIsGreater.biggerIsGreater("abcd"));
    }

    @Test
    public void biggerIsGreater2() {
        assertEquals("ba", BiggerIsGreater.biggerIsGreater("ab"));
    }

    @Test
    public void biggerIsGreater3() {
        assertEquals("No answer", BiggerIsGreater.biggerIsGreater("bb"));
    }
}