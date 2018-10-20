package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QueueReconstructionByHeightTest {

    @Test
    public void reconstructQueue() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] result = new QueueReconstructionByHeight().reconstructQueue(people);
        assertTrue(Arrays.deepEquals(people, result));
    }
}