package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoSumIVTest {

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

    private TwoSumIV ins = new TwoSumIV();


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
    public void invertTreePositive() {
        assertTrue(ins.findTarget(root, 12));
    }

    @Test
    public void invertTreeNegative() {
        assertFalse(ins.findTarget(root, 20));
        assertFalse(ins.findTarget(root, 0));
    }

    @Test
    public void invertTreeEmptyInput() {
        assertFalse(ins.findTarget(null, 203));

    }

    @Test
    public void invertTreeNotBalanced() {
        assertTrue(ins.findTarget(nodeNotBalancedRoot, 203));
    }
}