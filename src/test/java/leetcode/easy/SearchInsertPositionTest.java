package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class SearchInsertPositionTest {

    @Test
    public void searchInsert_target_in_middle() {
        SearchInsertPosition ins = new SearchInsertPosition();
        assertSame(2, ins.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    public void searchInsert_target_in_front() {
        SearchInsertPosition ins = new SearchInsertPosition();
        assertSame(0, ins.searchInsert(new int[]{1, 3, 5, 6}, 1));
    }

    @Test
    public void searchInsert_target_in_end() {
        SearchInsertPosition ins = new SearchInsertPosition();
        assertSame(3, ins.searchInsert(new int[]{1, 3, 5, 6}, 6));
    }

    @Test
    public void searchInsert_no_target() {
        SearchInsertPosition ins = new SearchInsertPosition();
        assertSame(1, ins.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }
}