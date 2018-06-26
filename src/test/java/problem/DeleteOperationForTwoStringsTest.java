package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteOperationForTwoStringsTest {

    @Test
    public void minDistance1() {
        assertEquals(2, new DeleteOperationForTwoStrings().minDistance("sea", "eat"));
    }

    @Test
    public void minDistance2() {
        assertEquals(4, new DeleteOperationForTwoStrings().minDistance("sea", "cat"));
    }

    @Test
    public void minDistance3() {
        assertEquals(3, new DeleteOperationForTwoStrings().minDistance("sea", "feat"));
    }
}