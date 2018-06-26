package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FindAllDuplicatesInAnArrayTest {

    @Test
    public void findDuplicates() {
        FindAllDuplicatesInAnArray ins = new FindAllDuplicatesInAnArray();
        ArrayList<Integer> exp = new ArrayList<>();
        exp.add(2);
        exp.add(3);
        assertEquals(exp, ins.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}