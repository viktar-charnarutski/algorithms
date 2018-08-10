package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayPartitionITest {

    @Test
    public void arrayPairSum() {
        assertEquals(4, new ArrayPartitionI().arrayPairSum(new int[]{1, 2, 3, 4}));
    }
}