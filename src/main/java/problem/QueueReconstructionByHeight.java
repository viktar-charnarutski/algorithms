package problem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 406. Queue Reconstruction by Height
 * <p>
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k),
 * where h is the height of the person and k is the number of people in front of this person who have a height greater
 * than or equal to h. Write an algorithm to reconstruct the queue.
 * <p>
 * Note:
 * The number of people is less than 1,100.
 */
public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] != b[0] ? b[0] - a[0] : a[1] - b[1]);
        List<int[]> order = new LinkedList<>();
        for (int[] person : people) {
            order.add(person[1], person);
        }
        return order.toArray(new int[people.length][]);
    }
}
