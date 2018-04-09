package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MinimumIndexSumOfTwoListsTest {
    private MinimumIndexSumOfTwoLists ins = new MinimumIndexSumOfTwoLists();

    @Test
    public void findRestaurant() {
        assertArrayEquals(new String[]{"Shogun"}, ins.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));

        assertArrayEquals(new String[]{"Shogun"}, ins.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Shogun", "Burger King"}));

        assertArrayEquals(new String[0], ins.findRestaurant(new String[]{"Shogun1", "Tapioca Express1", "Burger King1", "KFC1"},
                new String[]{"KFC", "Shogun", "Burger King"}));
    }
}