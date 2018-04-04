package strings.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class NextGreaterElementITest {

    @Test
    public void nextGreaterElement() {
        NextGreaterElementI ins = new NextGreaterElementI();
        assertArrayEquals(new int[]{-1, 3, -1}, ins.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
    }
}