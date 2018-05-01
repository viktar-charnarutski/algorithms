package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BinaryTreePruningTest {

    @Test
    public void pruneTree() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(0);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(0);
        TreeNode n5 = new TreeNode(0);
        TreeNode n6 = new TreeNode(0);
        TreeNode n7 = new TreeNode(1);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        TreeNode m1 = new TreeNode(1);
        TreeNode m3 = new TreeNode(1);
        TreeNode m7 = new TreeNode(1);

        m1.right = m3;
        m3.right = m7;

        BinaryTreePruning ins = new BinaryTreePruning();
        assertEquals(m1, ins.pruneTree(n1));
    }

    @Test
    public void pruneTree_one_node_is_zero_with_one_value_child() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(0);
        TreeNode n6 = new TreeNode(0);
        TreeNode n7 = new TreeNode(1);

        n1.right = n3;

        n3.left = n6;
        n3.right = n7;

        TreeNode m1 = new TreeNode(1);
        TreeNode m3 = new TreeNode(0);
        TreeNode m7 = new TreeNode(1);

        m1.right = m3;
        m3.right = m7;

        BinaryTreePruning ins = new BinaryTreePruning();
        assertEquals(m1, ins.pruneTree(n1));
    }

    @Test
    public void pruneTree_head_is_null() {
        BinaryTreePruning ins = new BinaryTreePruning();
        assertNull(ins.pruneTree(null));
    }

    @Test
    public void pruneTree_head_is_zero_without_children() {
        BinaryTreePruning ins = new BinaryTreePruning();
        assertNull(ins.pruneTree(new TreeNode(0)));
    }
    @Test
    public void pruneTree_head_is_zero_with_children_zero() {
        BinaryTreePruning ins = new BinaryTreePruning();
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        assertNull(ins.pruneTree(root));
    }
}