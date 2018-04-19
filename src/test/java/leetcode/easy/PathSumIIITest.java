package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class PathSumIIITest {

    @Test
    public void pathSum() {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(-3);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(11);
        TreeNode n7 = new TreeNode(3);
        TreeNode n8 = new TreeNode(-2);
        TreeNode n9 = new TreeNode(1);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.left = n7;
        n4.right = n8;
        n5.right = n9;
        n3.right = n6;

        PathSumIII ins = new PathSumIII();
        assertSame(3, ins.pathSum(n1, 8));
    }
}