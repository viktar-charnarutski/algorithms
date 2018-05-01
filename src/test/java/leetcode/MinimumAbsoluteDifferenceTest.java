package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MinimumAbsoluteDifferenceTest {
    private TreeNode root;
    private TreeNode node1;
    private TreeNode node2;
    private TreeNode node3;
    private TreeNode node4;
    private TreeNode node5;
    private TreeNode node6;
    private TreeNode node7;
    private TreeNode node8;
    private TreeNode node9;
    private TreeNode node10;

    private TreeNode nodeNotBalancedRoot;
    private TreeNode nodeNotBalancedNode1;

    private MinimumAbsoluteDifference ins = new MinimumAbsoluteDifference();

    @Before
    public void init() {
        root = new TreeNode(0);

        node1 = new TreeNode(1);
        node2 = new TreeNode(2);
        node3 = new TreeNode(3);
        node4 = new TreeNode(4);
        node5 = new TreeNode(5);
        node6 = new TreeNode(6);
        node7 = new TreeNode(7);
        node8 = new TreeNode(8);
        node9 = new TreeNode(9);
        node10 = new TreeNode(10);

        root.right = node1;
        root.left = node2;

        node1.right = node3;
        node1.left = node4;

        node2.right = node5;
        node2.left = node6;

        node3.right = node7;
        node3.left = node8;

        node4.right = node9;
        node4.left = node10;

        // not balanced
        nodeNotBalancedRoot = new TreeNode(101);
        nodeNotBalancedNode1 = new TreeNode(102);
        nodeNotBalancedRoot.left = nodeNotBalancedNode1;

    }

    @Test
    public void getMinimumDifference() {
        assertSame(1, ins.getMinimumDifference(node1));
        assertSame(1, ins.getMinimumDifference(nodeNotBalancedRoot));

        root.val = 3;
        node2.val = 1;
        node2.right= null;
        node6.val = 2;
        node6.left = null;
        node6.right = null;

        node1.val = 4;
        node1.left = null;
        node1.right = null;

        assertSame(1, ins.getMinimumDifference(root));

    }
}