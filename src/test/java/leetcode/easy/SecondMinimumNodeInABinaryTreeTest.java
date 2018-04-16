package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class SecondMinimumNodeInABinaryTreeTest {

    @Test
    public void findSecondMinimumValue() {
        SecondMinimumNodeInABinaryTree ins = new SecondMinimumNodeInABinaryTree();
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(7);

        n1.left = n2;
        n1.right= n3;
        n3.left = n4;
        n3.right = n5;

        assertSame(5, ins.findSecondMinimumValue(n1));

        TreeNode n6 = new TreeNode(2);
        TreeNode n7 = new TreeNode(2);
        TreeNode n8 = new TreeNode(2);

        n6.left = n7;
        n6.right= n8;

        assertSame(-1, ins.findSecondMinimumValue(n6));
        assertSame(-1, ins.findSecondMinimumValue(new TreeNode(1)));

        TreeNode n9 = new TreeNode(1);
        TreeNode n10 = new TreeNode(1);
        TreeNode n11 = new TreeNode(3);
        TreeNode n12 = new TreeNode(1);
        TreeNode n13 = new TreeNode(2);
        TreeNode n14 = new TreeNode(3);
        TreeNode n15 = new TreeNode(4);

        n9.left = n10;
        n9.right = n11;
        n10.left = n12;
        n10.right = n13;
        n11.left = n14;
        n11.right = n15;

        assertSame(2, ins.findSecondMinimumValue(n9));
    }
}