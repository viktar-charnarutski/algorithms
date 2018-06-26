package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheDuplicateNumberTest {

    @Test
    public void findDuplicate1() {
        assertEquals(2, new FindTheDuplicateNumber().findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }

    @Test
    public void findDuplicate2() {
        assertEquals(3, new FindTheDuplicateNumber().findDuplicate(new int[]{3,1,3,4,2}));
    }
}