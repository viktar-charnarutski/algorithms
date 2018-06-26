package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskSchedulerTest {

    @Test
    public void leastInterval1() {
        assertEquals(8, new TaskScheduler().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }

    @Test
    public void leastInterval2() {
        assertEquals(6, new TaskScheduler().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0));
    }

    @Test
    public void leastInterval3() {
        assertEquals(6, new TaskScheduler().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 1));
    }
}