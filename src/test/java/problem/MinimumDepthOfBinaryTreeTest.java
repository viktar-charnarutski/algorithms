package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MinimumDepthOfBinaryTreeTest {

    @Test
    public void minDepth() {
        TreeNode n3 = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);
        TreeNode n20 = new TreeNode(20);
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);

        n3.left = n9;
        n3.right = n20;

        n20.left = n15;
        n20.right = n7;

        MinimumDepthOfBinaryTree ins = new MinimumDepthOfBinaryTree();
        assertSame(2, ins.minDepth(n3));

    }

    @Test
    public void minDepth_two_nodes() {
        TreeNode n3 = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);

        n3.left = n9;

        MinimumDepthOfBinaryTree ins = new MinimumDepthOfBinaryTree();
        assertSame(2, ins.minDepth(n3));

    }
}