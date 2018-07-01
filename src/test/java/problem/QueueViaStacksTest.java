package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueViaStacksTest {

    @Test
    public void queue() {
        QueueViaStacks<Integer> queue = new QueueViaStacks<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        assertEquals(1, (int) queue.peek());
        assertEquals(5, queue.size());
        queue.remove();
        assertEquals(2, (int) queue.peek());
        assertEquals(4, queue.size());
    }
}