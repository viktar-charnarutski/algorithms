package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    public void buildTree() {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        assertEquals(n1, new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
    }
}