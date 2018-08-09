package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateBinarySearchTreeTest {

    @Test
    public void isValidBST1() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n2.left = n1;
        n2.right = n3;
        assertTrue(new ValidateBinarySearchTree().isValidBST(n2));
    }

    @Test
    public void isValidBST2() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        n5.left = n1;
        n5.right = n4;
        n4.left = n3;
        n4.right = n6;
        assertFalse(new ValidateBinarySearchTree().isValidBST(n5));
    }

    @Test
    public void isValidBST3() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n1_1 = new TreeNode(1);
        n1.left = n1_1;
        assertFalse(new ValidateBinarySearchTree().isValidBST(n1));
    }

    @Test
    public void isValidBST4() {
        TreeNode n10 = new TreeNode(10);
        TreeNode n5 = new TreeNode(5);
        TreeNode n15 = new TreeNode(15);
        TreeNode n6 = new TreeNode(6);
        TreeNode n20 = new TreeNode(20);
        n10.left = n5;
        n10.right = n15;
        n15.left = n6;
        n15.right = n20;
        assertFalse(new ValidateBinarySearchTree().isValidBST(n10));
    }
}