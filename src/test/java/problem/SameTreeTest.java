package problem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameTreeTest {

    private SameTree ins = new SameTree();

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

    private TreeNode nodeNotBalancedRootP;
    private TreeNode nodeNotBalancedNode1P;

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

    private TreeNode nodeNotBalancedRootQ;
    private TreeNode nodeNotBalancedNode1Q;


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

        rootP.right = node1P;
        rootP.left = node2P;

        node1P.right = node3P;
        node1P.left = node4P;

        node2P.right = node5P;
        node2P.left = node6P;

        node3P.right = node7P;
        node3P.left = node8P;

        node4P.right = node9P;
        node4P.left = node10P;

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

        rootQ.right = node1Q;
        rootQ.left = node2Q;

        node1Q.right = node3Q;
        node1Q.left = node4Q;

        node2Q.right = node5Q;
        node2Q.left = node6Q;

        node3Q.right = node7Q;
        node3Q.left = node8Q;

        node4Q.right = node9Q;
        node4Q.left = node10Q;

        // not balanced
        nodeNotBalancedRootP = new TreeNode(101);
        nodeNotBalancedNode1P = new TreeNode(102);
        nodeNotBalancedRootP.left = nodeNotBalancedNode1Q;

        nodeNotBalancedRootQ = new TreeNode(101);
        nodeNotBalancedNode1Q = new TreeNode(102);
        nodeNotBalancedRootQ.left = nodeNotBalancedNode1Q;

    }

    @Test
    public void isSameTreeTrue() {
        assertTrue(ins.isSameTree(rootP, rootQ));
    }

    @Test
    public void isSameTreeFalse() {
        node10Q.val = 11;
        assertFalse(ins.isSameTree(rootP, rootQ));
    }
}