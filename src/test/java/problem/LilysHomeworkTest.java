package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class LilysHomeworkTest {

    @Test
    public void lilysHomework1() {
        assertEquals(2, LilysHomework.lilysHomework(new int[]{7, 15, 12, 3}));
    }

    @Test
    public void lilysHomework2() {
        assertEquals(2, LilysHomework.lilysHomework(new int[]{2, 5, 3, 1}));
    }
}