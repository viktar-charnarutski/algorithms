package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void productExceptSelf() {
        ProductOfArrayExceptSelf ins = new ProductOfArrayExceptSelf();
        assertArrayEquals(new int[]{24, 12, 8, 6}, ins.productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}