package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PartitionEqualSubsetSumTest {

    @Test
    public void canPartition_true() {
        assertTrue(new PartitionEqualSubsetSum().canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    public void canPartition_false() {
        assertFalse(new PartitionEqualSubsetSum().canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    public void canPartition_empty() {
        assertFalse(new PartitionEqualSubsetSum().canPartition(new int[]{}));
    }

    @Test
    public void canPartition_null() {
        assertFalse(new PartitionEqualSubsetSum().canPartition(null));
    }

    @Test
    public void canPartition_one_element() {
        assertFalse(new PartitionEqualSubsetSum().canPartition(new int[]{1}));
    }

    @Test
    public void canPartition_two_elements_true() {
        assertTrue(new PartitionEqualSubsetSum().canPartition(new int[]{5, 5}));
    }

    @Test
    public void canPartition_two_elements_false() {
        assertFalse(new PartitionEqualSubsetSum().canPartition(new int[]{5, 6}));
    }

    @Test
    public void canPartition_huge_input() {
        assertFalse(new PartitionEqualSubsetSum().canPartition(new int[]{
                17, 58, 41, 75, 61, 70, 52, 7, 38, 11, 40, 58, 44, 45, 4, 81, 67, 54, 79, 80, 15, 3, 14, 16, 9, 66, 69, 41, 72, 37, 28, 3, 33, 90, 56, 12, 72, 49, 35, 22, 49, 27, 49, 82, 41, 77, 100, 82, 18, 95, 24, 51, 37, 2, 34, 82, 70, 53, 73, 32, 90, 98, 81, 22, 73, 76, 79, 40, 27, 62, 45, 96, 36, 15, 63, 28, 54, 88, 63, 37, 58, 9, 62, 98, 93, 72, 99, 53, 91, 29, 61, 31, 11, 42, 20, 35, 50, 68, 10, 86}));
    }
}