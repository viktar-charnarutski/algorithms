package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrimBinarySearchTreeTest {

    @Test
    public void trimBST() {
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);

        n3.left = n0;
        n3.right = n4;

        n4.right = n2;
        n2.left = n1;

        TreeNode n23 = new TreeNode(3);
        TreeNode n22 = new TreeNode(2);
        TreeNode n21 = new TreeNode(1);
        n23.right = n22;
        n22.left = n21;

        TrimBinarySearchTree ins = new TrimBinarySearchTree();
        assertEquals(n23, ins.trimBST(n3, 1, 3));
    }
}