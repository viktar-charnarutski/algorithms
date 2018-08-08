package problem;

import org.junit.Test;

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
}