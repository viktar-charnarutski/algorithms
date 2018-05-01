package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class CountPrimesTest {

    @Test
    public void countPrimes() {
        CountPrimes ins = new CountPrimes();
        assertSame(4, ins.countPrimes(10));
        assertSame(0, ins.countPrimes(2));
        assertSame(41537, ins.countPrimes(499979));
    }
}