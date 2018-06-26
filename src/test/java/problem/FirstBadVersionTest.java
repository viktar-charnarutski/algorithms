package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class FirstBadVersionTest {

    @Test
    public void firstBadVersion_middle() {
        FirstBadVersion ins = new FirstBadVersion(5);
        assertSame(5, ins.firstBadVersion(10));
    }

    @Test
    public void firstBadVersion_beginning() {
        FirstBadVersion ins = new FirstBadVersion(1);
        assertSame(1, ins.firstBadVersion(10));
    }

    @Test
    public void firstBadVersion_end() {
        FirstBadVersion ins = new FirstBadVersion(10);
        assertSame(10, ins.firstBadVersion(10));
    }
}