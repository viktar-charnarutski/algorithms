package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MergeTwoBinaryTreesTest {

    private MergeTwoBinaryTrees ins = new MergeTwoBinaryTrees();

    private TreeNode rootP;
    private TreeNode node1P;
    private TreeNode node2P;
    private TreeNode node3P;
    private TreeNode node4P;
    private TreeNode node5P;
    private TreeNode node6P;
    private TreeNode node7P;
    private TreeNode node8P;
    private TreeNode node9P;
    private TreeNode node10P;

    private TreeNode rootQ;
    private TreeNode node1Q;
    private TreeNode node2Q;
    private TreeNode node3Q;
    private TreeNode node4Q;
    private TreeNode node5Q;
    private TreeNode node6Q;
    private TreeNode node7Q;
    private TreeNode node8Q;
    private TreeNode node9Q;
    private TreeNode node10Q;

    @Before
    public void init() {
        rootP = new TreeNode(0);
        node1P = new TreeNode(1);
        node2P = new TreeNode(2);
        node3P = new TreeNode(3);
        node4P = new TreeNode(4);
        node5P = new TreeNode(5);
        node6P = new TreeNode(6);
        node7P = new TreeNode(7);
        node8P = new TreeNode(8);
        node9P = new TreeNode(9);
        node10P = new TreeNode(10);

        rootQ = new TreeNode(0);
        node1Q = new TreeNode(1);
        node2Q = new TreeNode(2);
        node3Q = new TreeNode(3);
        node4Q = new TreeNode(4);
        node5Q = new TreeNode(5);
        node6Q = new TreeNode(6);
        node7Q = new TreeNode(7);
        node8Q = new TreeNode(8);
        node9Q = new TreeNode(9);
        node10Q = new TreeNode(10);

        rootP.right = node1P;
        rootP.left = node2P;
        node1P.right = node3P;

        rootQ.right = node1Q;
        rootQ.left = node2Q;
        node1Q.right = node3Q;
        node2Q.right = node5Q;

    }

    @Test
    public void mergeTreesTrue() {
        TreeNode treeNode = ins.mergeTrees(rootP, rootQ);
        assertSame(2, treeNode.right.val);
        assertSame(4, treeNode.left.val);
    }
}