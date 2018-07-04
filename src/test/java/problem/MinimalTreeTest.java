package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimalTreeTest {

    @Test
    public void minimalTree() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n4.left = n2;
        n4.right = n6;

        n2.left = n1;
        n2.right = n3;

        n6.left = n5;
        n6.right = n7;

        assertEquals(n4, new MinimalTree().minimalTree(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }
}