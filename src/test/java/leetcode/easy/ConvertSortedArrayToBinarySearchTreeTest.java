package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void sortedArrayToBST() {
        ConvertSortedArrayToBinarySearchTree ins = new ConvertSortedArrayToBinarySearchTree();

        TreeNode n1 = new TreeNode(0);
        TreeNode n2 = new TreeNode(-3);
        TreeNode n3 = new TreeNode(9);
        TreeNode n4 = new TreeNode(-10);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.left = n5;

        assertEquals(n1, ins.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
    }
}