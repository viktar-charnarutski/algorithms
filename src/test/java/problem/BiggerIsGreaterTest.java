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
        assertEquals("no answer", BiggerIsGreater.biggerIsGreater("bb"));
    }

    @Test
    public void biggerIsGreater4() {
        assertEquals("hegf", BiggerIsGreater.biggerIsGreater("hefg"));
    }

    @Test
    public void biggerIsGreater5() {
        assertEquals("dhkc", BiggerIsGreater.biggerIsGreater("dhck"));
    }

    @Test
    public void biggerIsGreater6() {
        assertEquals("hcdk", BiggerIsGreater.biggerIsGreater("dkhc"));
    }

    @Test
    public void biggerIsGreater7() {
        assertEquals("no answer", BiggerIsGreater.biggerIsGreater("a"));
    }
}