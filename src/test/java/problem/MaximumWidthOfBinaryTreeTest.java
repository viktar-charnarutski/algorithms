package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumWidthOfBinaryTreeTest {

    @Test
    public void widthOfBinaryTree1() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.right = n6;

        assertEquals(4, new MaximumWidthOfBinaryTree().widthOfBinaryTree(n1));
    }

    @Test
    public void widthOfBinaryTree2() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;

        n2.left = n4;
        n2.right = n5;

        assertEquals(2, new MaximumWidthOfBinaryTree().widthOfBinaryTree(n1));
    }
}