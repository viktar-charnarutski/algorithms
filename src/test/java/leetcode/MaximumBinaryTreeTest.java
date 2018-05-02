package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumBinaryTreeTest {

    @Test
    public void constructMaximumBinaryTree() {
        TreeNode n1 = new TreeNode(6);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(0);
        TreeNode n6 = new TreeNode(1);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n4.left = n6;
        n3.right = n5;

        MaximumBinaryTree ins = new MaximumBinaryTree();
        assertEquals(n1, ins.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5}));
    }
    @Test
    public void constructMaximumBinaryTree_3_items() {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(1);

        n1.right = n2;
        n2.right = n3;

        MaximumBinaryTree ins = new MaximumBinaryTree();
        assertEquals(n1, ins.constructMaximumBinaryTree(new int[]{3, 2, 1}));
    }
}