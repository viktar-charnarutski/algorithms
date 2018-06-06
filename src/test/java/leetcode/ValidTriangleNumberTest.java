package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidTriangleNumberTest {

    @Test
    public void triangleNumber0() {
        assertEquals(0, new ValidTriangleNumber().triangleNumber(null));
        assertEquals(0, new ValidTriangleNumber().triangleNumber(new int[]{2}));
        assertEquals(0, new ValidTriangleNumber().triangleNumber(new int[]{2, 2}));
    }

    @Test
    public void triangleNumber1() {
        assertEquals(3, new ValidTriangleNumber().triangleNumber(new int[]{2, 2, 3, 4}));
    }
}