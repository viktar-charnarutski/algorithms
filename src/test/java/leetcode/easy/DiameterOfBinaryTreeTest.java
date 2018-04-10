package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class DiameterOfBinaryTreeTest {

    private DiameterOfBinaryTree ins = new DiameterOfBinaryTree();

    @Test
    public void diameterOfBinaryTree() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);
        TreeNode n12 = new TreeNode(12);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n5.left = n6;
        n6.right = n7;
        n7.left = n8;
        n7.right = n9;
        n9.right = n10;
        n8.left = n11;
        n11.right = n12;

        assertSame(8, ins.diameterOfBinaryTree(n1));
    }
}