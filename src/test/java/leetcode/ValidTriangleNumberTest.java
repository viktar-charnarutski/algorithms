package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidTriangleNumberTest {

    @Test
    public void triangleNumber1() {
        assertEquals(3, new ValidTriangleNumber().triangleNumber(new int[]{2, 2, 3, 4}));
    }
}