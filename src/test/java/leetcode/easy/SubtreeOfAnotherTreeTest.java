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


    @Test
    public void isSubtree_long_right_node() {
        TreeNode n10 = new TreeNode(1);
        TreeNode n11 = new TreeNode(1);
        TreeNode n12 = new TreeNode(1);
        TreeNode n13 = new TreeNode(1);
        TreeNode n14 = new TreeNode(1);
        TreeNode n15 = new TreeNode(1);
        TreeNode n16 = new TreeNode(1);
        TreeNode n17 = new TreeNode(1);
        TreeNode n18 = new TreeNode(1);
        TreeNode n19 = new TreeNode(2);

        n10.right = n11;
        n11.right = n12;
        n12.right = n13;
        n13.right = n14;
        n14.right = n15;
        n15.right = n16;
        n16.right = n17;
        n17.right = n18;
        n17.left = n19;

        TreeNode n24 = new TreeNode(1);
        TreeNode n25 = new TreeNode(1);
        TreeNode n26 = new TreeNode(1);
        TreeNode n27 = new TreeNode(1);
        TreeNode n28 = new TreeNode(1);
        TreeNode n29 = new TreeNode(2);

        n24.right = n25;
        n25.right = n26;
        n26.right = n27;
        n27.right = n28;
        n27.left = n29;

        SubtreeOfAnotherTree ins = new SubtreeOfAnotherTree();
        assertFalse(ins.isSubtree(n24, n10));
    }


    @Test
    public void isSubtree_long_left_node() {
        TreeNode n10 = new TreeNode(1);
        TreeNode n11 = new TreeNode(1);
        TreeNode n12 = new TreeNode(1);
        TreeNode n13 = new TreeNode(1);
        TreeNode n14 = new TreeNode(1);
        TreeNode n15 = new TreeNode(1);
        TreeNode n16 = new TreeNode(1);
        TreeNode n17 = new TreeNode(1);
        TreeNode n18 = new TreeNode(1);
        TreeNode n19 = new TreeNode(2);

        n10.left = n11;
        n11.left = n12;
        n12.left = n13;
        n13.left = n14;
        n14.left = n15;
        n15.left = n16;
        n16.left = n17;
        n17.left = n18;
        n17.right = n19;

        TreeNode n24 = new TreeNode(1);
        TreeNode n25 = new TreeNode(1);
        TreeNode n26 = new TreeNode(1);
        TreeNode n27 = new TreeNode(1);
        TreeNode n28 = new TreeNode(1);
        TreeNode n29 = new TreeNode(2);

        n24.left = n25;
        n25.left = n26;
        n26.left = n27;
        n27.left = n28;
        n27.right = n29;

        SubtreeOfAnotherTree ins = new SubtreeOfAnotherTree();
        assertFalse(ins.isSubtree(n24, n10));
    }
}