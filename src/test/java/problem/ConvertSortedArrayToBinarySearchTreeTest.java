package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void sortedArrayToBST() {
        ConvertSortedArrayToBinarySearchTree ins = new ConvertSortedArrayToBinarySearchTree();

        TreeNode n0 = new TreeNode(0);
        TreeNode nm3 = new TreeNode(-3);
        TreeNode nm10 = new TreeNode(-10);
        TreeNode n5 = new TreeNode(5);
        TreeNode n9 = new TreeNode(9);

        n0.left = nm10;
        n0.right = n5;
        nm10.right = nm3;
        n5.right = n9;

        assertEquals(n0, ins.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
    }
}