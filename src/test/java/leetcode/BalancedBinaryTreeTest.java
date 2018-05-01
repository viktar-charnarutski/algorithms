package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBinaryTreeTest {

    @Test
    public void isBalanced_balanced() {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;

        n3.left = n4;
        n3.right = n5;

        BalancedBinaryTree ins = new BalancedBinaryTree();
        assertTrue(ins.isBalanced(n1));
    }
    @Test
    public void isBalanced_not_balanced() {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        TreeNode n6 = new TreeNode(5);
        TreeNode n7 = new TreeNode(6);

        n1.left = n2;
        n1.right = n3;

        n3.left = n4;
        n3.right = n5;

        n5.left = n6;
        n5.right = n7;

        BalancedBinaryTree ins = new BalancedBinaryTree();
        assertFalse(ins.isBalanced(n1));
    }

}