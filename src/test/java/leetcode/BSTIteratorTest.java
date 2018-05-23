package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BSTIteratorTest {

    @Test
    public void iterator() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;

        BSTIterator i = new BSTIterator(n1);
        int[] res = new int[2];
        int ind = 0;
        while (i.hasNext()) res[ind++] = i.next();
        assertArrayEquals(res, new int[]{2, 4});
    }

    @Test
    public void hasNext() {
    }

    @Test
    public void next() {
    }
}