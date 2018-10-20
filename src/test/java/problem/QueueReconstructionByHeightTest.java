package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QueueReconstructionByHeightTest {

    @Test
    public void reconstructQueue() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] expected = {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        int[][] result = new QueueReconstructionByHeight().reconstructQueue(people);
        for (int i = 0; i < people.length; i++) {
            assertArrayEquals(expected[i], result[i]);
        }
    }
}