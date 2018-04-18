package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class RemoveElementTest {

    @Test
    public void removeElement() {
        RemoveElement ins = new RemoveElement();
        int[] input1 = {3, 2, 2, 3};
        assertSame(2, ins.removeElement(input1, 3));

        int[] input2 = {0, 1, 2, 2, 3, 0, 4, 2};
        assertSame(5, ins.removeElement(input2, 2));
    }

    @Test
    public void removeElement_input_null() {
        RemoveElement ins = new RemoveElement();
        assertSame(0, ins.removeElement(null, 3));
    }

    @Test
    public void removeElement_input_empty() {
        RemoveElement ins = new RemoveElement();
        assertSame(0, ins.removeElement(new int[]{}, 3));
    }
}