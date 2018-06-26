package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        MergeSortedArray ins = new MergeSortedArray();

        int[] output = new int[]{1, 2, 2, 3, 5, 6};
        int[] input1 = {1, 2, 3, 0, 0, 0};
        int[] input2 = {2, 5, 6};

        ins.merge(input1, 3, input2, 3);
        assertArrayEquals(output, input1);
    }
}