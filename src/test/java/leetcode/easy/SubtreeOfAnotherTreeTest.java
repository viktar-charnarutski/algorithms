package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SubtreeOfAnotherTreeTest {

    @Test
    public void isSubtree_true() {
        TreeNode n11 = new TreeNode(1);
        TreeNode n12 = new TreeNode(2);
        TreeNode n13 = new TreeNode(3);
        TreeNode n14 = new TreeNode(4);
        TreeNode n15 = new TreeNode(5);

        n13.left = n14;
        n13.right = n15;
        n14.left = n11;
        n14.right = n12;

        TreeNode n21 = new TreeNode(1);
        TreeNode n22 = new TreeNode(2);
        TreeNode n24 = new TreeNode(4);

        n24.left = n21;
        n24.right = n22;

        SubtreeOfAnotherTree ins = new SubtreeOfAnotherTree();
        assertTrue(ins.isSubtree(n13, n24));
    }

    @Test
    public void isSubtree_extra_left_node() {
        TreeNode n10 = new TreeNode(0);
        TreeNode n11 = new TreeNode(1);
        TreeNode n12 = new TreeNode(2);
        TreeNode n13 = new TreeNode(3);
        TreeNode n14 = new TreeNode(4);
        TreeNode n15 = new TreeNode(5);

        n13.left = n14;
        n13.right = n15;
        n14.left = n11;
        n14.right = n12;
        n12.left = n10;

        TreeNode n21 = new TreeNode(1);
        TreeNode n22 = new TreeNode(2);
        TreeNode n24 = new TreeNode(4);

        n24.left = n21;
        n24.right = n22;

        SubtreeOfAnotherTree ins = new SubtreeOfAnotherTree();
        assertFalse(ins.isSubtree(n13, n24));
    }
    @Test
    public void isSubtree_extra_right_node() {
        TreeNode n10 = new TreeNode(0);
        TreeNode n11 = new TreeNode(1);
        TreeNode n12 = new TreeNode(2);
        TreeNode n13 = new TreeNode(3);
        TreeNode n14 = new TreeNode(4);
        TreeNode n15 = new TreeNode(5);

        n13.left = n14;
        n13.right = n15;
        n14.left = n11;
        n14.right = n12;
        n12.right = n10;

        TreeNode n21 = new TreeNode(1);
        TreeNode n22 = new TreeNode(2);
        TreeNode n24 = new TreeNode(4);

        n24.left = n21;
        n24.right = n22;

        SubtreeOfAnotherTree ins = new SubtreeOfAnotherTree();
        assertFalse(ins.isSubtree(n13, n24));
    }

    @Test
    public void isSubtree_one_node_trees() {
        SubtreeOfAnotherTree ins = new SubtreeOfAnotherTree();
        assertTrue(ins.isSubtree(new TreeNode(1),  new TreeNode(1)));
    }
}