package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateIITest {

    @Test
    public void containsNearbyDuplicate_true() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 1, 8, 9};
        assertTrue(new ContainsDuplicateII().containsNearbyDuplicate(input, 6));
    }

    @Test
    public void containsNearbyDuplicate_false() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 1, 8, 9};
        assertFalse(new ContainsDuplicateII().containsNearbyDuplicate(input, 4));
    }

    @Test
    public void containsNearbyDuplicate_target_is_zero() {
        int[] input = {0};
        assertFalse(new ContainsDuplicateII().containsNearbyDuplicate(input, 1));
    }

    @Test
    public void containsNearbyDuplicate_max_target() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 0};
        assertTrue(new ContainsDuplicateII().containsNearbyDuplicate(input, 9));
    }

    @Test
    public void containsNearbyDuplicate_min_target() {
        int[] input = {0, 0, 2, 3, 4, 5, 6, 7, 8, 0};
        assertTrue(new ContainsDuplicateII().containsNearbyDuplicate(input, 1));
    }

    @Test
    public void containsNearbyDuplicate_target_equals_elements_amount() {
        int[] input = {0, 0};
        assertTrue(new ContainsDuplicateII().containsNearbyDuplicate(input, 2));
    }

    @Test
    public void containsNearbyDuplicate_target_greater_elements_amount() {
        int[] input = {0, 0};
        assertTrue(new ContainsDuplicateII().containsNearbyDuplicate(input, 3));
    }

    @Test
    public void containsNearbyDuplicate_target_is_two() {
        int[] input = {0, 1, 0};
        assertFalse(new ContainsDuplicateII().containsNearbyDuplicate(input, 1));
    }
}