package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PushDominoesTest {

    @Test
    public void pushDominoes1() {
        assertEquals("LL.RR.LLRRLL..", new PushDominoes().pushDominoes(".L.R...LR..L.."));
    }

    @Test
    public void pushDominoes2() {
        assertEquals("RR.L", new PushDominoes().pushDominoes("RR.L"));
    }
}