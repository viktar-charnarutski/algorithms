package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SymmetricTreeTest {

    @Test
    public void isSymmetric_true() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        SymmetricTree ins = new SymmetricTree();
        assertTrue(ins.isSymmetric(n1));
    }

    @Test
    public void isSymmetric_false() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(5);
        TreeNode n7 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        SymmetricTree ins = new SymmetricTree();
        assertFalse(ins.isSymmetric(n1));
    }

    @Test
    public void isSymmetric_not_symmetric() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(3);
        TreeNode n8 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n7.right = n8;

        SymmetricTree ins = new SymmetricTree();
        assertFalse(ins.isSymmetric(n1));
    }
    @Test
    public void isSymmetric_not_symmetric_2_nodes() {
        TreeNode n1 = new TreeNode(1);
        n1.left = new TreeNode(2);

        SymmetricTree ins = new SymmetricTree();
        assertFalse(ins.isSymmetric(n1));
    }

    @Test
    public void isSymmetric_not_symmetric_5_nodes() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.left = n5;

        SymmetricTree ins = new SymmetricTree();
        assertFalse(ins.isSymmetric(n1));
    }

    @Test
    public void isSymmetric_symmetric_5_nodes() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.right = n5;

        SymmetricTree ins = new SymmetricTree();
        assertTrue(ins.isSymmetric(n1));
    }

    @Test
    public void isSymmetric_one_node() {
        SymmetricTree ins = new SymmetricTree();
        assertTrue(ins.isSymmetric(new TreeNode(1)));
    }

    @Test
    public void isSymmetric_empty_input() {
        SymmetricTree ins = new SymmetricTree();
        assertFalse(ins.isSymmetric(null));
    }
}