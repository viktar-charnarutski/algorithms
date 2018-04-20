package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class LowestCommonAncestorOfBSTTest {

    @Test
    public void lowestCommonAncestor() {
        TreeNode n1 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(0);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(7);
        TreeNode n7 = new TreeNode(9);
        TreeNode n8 = new TreeNode(3);
        TreeNode n9 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n5.left = n8;
        n5.right = n9;

        LowestCommonAncestorOfBST ins1 = new LowestCommonAncestorOfBST();
        LowestCommonAncestorOfBST ins2 = new LowestCommonAncestorOfBST();
        assertSame(n1, ins1.lowestCommonAncestor(n1, n2, n3));
        assertSame(n2, ins2.lowestCommonAncestor(n1, n5, n2));
    }
}