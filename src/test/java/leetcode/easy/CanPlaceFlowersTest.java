package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanPlaceFlowersTest {

    @Test
    public void canPlaceFlowers_true_1() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertTrue(ins.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    public void canPlaceFlowers_false_1() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertFalse(ins.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    @Test
    public void canPlaceFlowers_false__one_element() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertFalse(ins.canPlaceFlowers(new int[]{1}, 1));
    }

    @Test
    public void canPlaceFlowers_true_one_element() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertTrue(ins.canPlaceFlowers(new int[]{0}, 1));
    }

    @Test
    public void canPlaceFlowers_false_two_elements() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertFalse(ins.canPlaceFlowers(new int[]{1, 0}, 1));
    }

    @Test
    public void canPlaceFlowers_true_two_elements() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertTrue(ins.canPlaceFlowers(new int[]{0, 0}, 1));
    }

    @Test
    public void canPlaceFlowers_false_three_elements() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertFalse(ins.canPlaceFlowers(new int[]{0, 1, 0}, 1));
    }

    @Test
    public void canPlaceFlowers_true_three_elements() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertTrue(ins.canPlaceFlowers(new int[]{0, 0, 1}, 1));
    }

    @Test
    public void canPlaceFlowers_false_six_elements() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertFalse(ins.canPlaceFlowers(new int[]{0, 1, 0, 1, 0, 0}, 3));
    }

    @Test
    public void canPlaceFlowers_true_six_elements() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertFalse(ins.canPlaceFlowers(new int[]{0, 1, 0, 1, 0, 0}, 2));
    }

    @Test
    public void canPlaceFlowers_true_zero_target() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertTrue(ins.canPlaceFlowers(new int[]{0, 1, 0, 1, 0, 1}, 0));
    }

    @Test
    public void canPlaceFlowers_true_target_is_less_than_free_spots() {
        CanPlaceFlowers ins = new CanPlaceFlowers();
        assertTrue(ins.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1));
    }
}