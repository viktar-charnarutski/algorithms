package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class InvertBinaryTreeTest {

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
        InvertBinaryTree ins = new InvertBinaryTree();
        ins.invertTree(root);

        assertSame(root.right, node2);
        assertSame(root.left, node1);

        assertSame(node1.right, node4);
        assertSame(node1.left, node3);

        assertSame(node2.right, node6);
        assertSame(node2.left, node5);

        assertSame(node3.right, node8);
        assertSame(node3.left, node7);

        assertSame(node4.right, node10);
        assertSame(node4.left, node9);
    }

    @Test
    public void invertTreeEmptyInput() {
        InvertBinaryTree ins = new InvertBinaryTree();
        assertNull(ins.invertTree(null));

    }

    @Test
    public void invertTreeNotBalanced() {
        InvertBinaryTree ins = new InvertBinaryTree();
        ins.invertTree(nodeNotBalancedRoot);
        assertSame(nodeNotBalancedRoot.right, nodeNotBalancedNode1);
        assertNull(nodeNotBalancedRoot.left);
    }
}