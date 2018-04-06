package leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static leetcode.easy.MaximumDepthOfBinaryTree.TreeNode;
import static org.junit.Assert.assertSame;

public class MaximumDepthOfBinaryTreeTest {

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

    private MaximumDepthOfBinaryTree ins = new MaximumDepthOfBinaryTree();


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
        assertSame(4, ins.maxDepth(root));
    }

    @Test
    public void invertTreeEmptyInput() {
        assertSame(0, ins.maxDepth(null));

    }

    @Test
    public void invertTreeNotBalanced() {
        assertSame(2, ins.maxDepth(nodeNotBalancedRoot));
    }
}