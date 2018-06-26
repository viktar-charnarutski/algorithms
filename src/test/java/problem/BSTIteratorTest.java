package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTIteratorTest {

    @Test
    public void iterator() {
        TreeNode n1 = new TreeNode(8);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(10);
        n1.left = n2;
        n1.right = n3;
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(6);
        n2.left = n4;
        n2.right = n5;
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        n5.left = n6;
        n5.right = n7;
        TreeNode n8 = new TreeNode(14);
        n3.right = n8;
        TreeNode n9 = new TreeNode(13);
        n8.left = n9;

        BSTIterator i = new BSTIterator(n1);
        int[] res = new int[9];
        int ind = 0;
        while (i.hasNext()) {
            res[ind++] = i.next();
        }

        assertArrayEquals(res, new int[]{1, 3, 4, 6, 7, 8, 10, 13, 14});
    }

    @Test
    public void hasNext1() {
        assertTrue(new BSTIterator(new TreeNode(1)).hasNext());
    }

    @Test
    public void hasNext2() {
        BSTIterator itr = new BSTIterator(new TreeNode(1));
        itr.next();
        assertFalse(itr.hasNext());
    }

    @Test
    public void next1() {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(1);
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n2.left = n5;

        BSTIterator itr = new BSTIterator(n1);
        assertEquals(1, itr.next());
    }
}