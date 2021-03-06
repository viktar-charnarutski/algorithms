package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeMaximumPathSumTest {

    @Test
    public void maxPathSum1() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        assertEquals(18, new BinaryTreeMaximumPathSum().maxPathSum(n1));
    }

    @Test
    public void maxPathSum2() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(30);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(60);
        TreeNode n7 = new TreeNode(70);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        assertEquals(160, new BinaryTreeMaximumPathSum().maxPathSum(n1));
    }

    @Test
    public void maxPathSum3() {
        TreeNode n1 = new TreeNode(-10);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        assertEquals(16, new BinaryTreeMaximumPathSum().maxPathSum(n1));
    }

    @Test
    public void maxPathSum4() {
        TreeNode n1 = new TreeNode(-10);
        assertEquals(-10, new BinaryTreeMaximumPathSum().maxPathSum(n1));
    }

    @Test
    public void maxPathSum5() {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(-10);
        n1.left = n2;
        assertEquals(10, new BinaryTreeMaximumPathSum().maxPathSum(n1));
    }

    @Test
    public void maxPathSum6() {
        TreeNode n1 = new TreeNode(-10);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(-7);
        n1.left = n2;
        n2.right = n3;
        n3.left = n4;
        n4.right = n5;
        n5.left = n6;
        n6.right = n7;
        assertEquals(20, new BinaryTreeMaximumPathSum().maxPathSum(n1));
    }
}