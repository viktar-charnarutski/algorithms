package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToLowerCaseTest {

    @Test
    public void toLowerCase1() {
        assertEquals("hello", new ToLowerCase().toLowerCase("Hello"));
    }
    @Test
    public void toLowerCase2() {
        assertEquals("hello", new ToLowerCase().toLowerCase("HELLO"));
    }
    @Test
    public void toLowerCase3() {
        assertEquals("hello", new ToLowerCase().toLowerCase("HelLo"));
    }
    @Test
    public void toLowerCase4() {
        assertEquals("", new ToLowerCase().toLowerCase(""));
    }
    @Test
    public void toLowerCase5() {
        assertEquals("", new ToLowerCase().toLowerCase(" "));
    }
}