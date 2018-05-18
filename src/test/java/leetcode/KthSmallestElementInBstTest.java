package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthSmallestElementInBstTest {

    @Test
    public void kthSmallest() {
        TreeNode n1 = new TreeNode(8);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(10);
        n1.left = n2;
        n1.right = n3;
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(6);
        n2.left = n4;
        n2.right = n5;
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        n5.left = n6;
        n5.right = n7;
        TreeNode n8 = new TreeNode(14);
        n3.right = n8;
        TreeNode n9 = new TreeNode(13);
        n8.left = n9;
        assertEquals(4, new KthSmallestElementInBst().kthSmallest(n1, 3));
    }
}