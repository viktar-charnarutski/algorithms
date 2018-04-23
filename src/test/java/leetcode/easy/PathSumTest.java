package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PathSumTest {

    @Test
    public void hasPathSum() {
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n8 = new TreeNode(8);
        TreeNode n11 = new TreeNode(11);
        TreeNode n13 = new TreeNode(13);
        TreeNode n7 = new TreeNode(7);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);

        n5.left = n4;
        n5.right = n8;

        n4.left = n11;

        n11.left = n7;
        n11.right = n2;

        n8.left = n13;
        n8.right = n4;
        n4.right = n1;

        PathSum ins = new PathSum();
        assertTrue(ins.hasPathSum(n5, 22));
    }

    @Test
    public void hasPathSum_negatives() {
        TreeNode nm2 = new TreeNode(-2);
        TreeNode nm3 = new TreeNode(-3);

        nm2.right = nm3;

        PathSum ins = new PathSum();
        assertTrue(ins.hasPathSum(nm2, -5));
    }
}