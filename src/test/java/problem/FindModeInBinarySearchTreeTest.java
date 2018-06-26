package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindModeInBinarySearchTreeTest {

    @Test
    public void findMode() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(5);
        TreeNode n7 = new TreeNode(5);
        TreeNode n8 = new TreeNode(6);

        n1.left = n2;
        n1.right = n3;

        n3.left = n4;
        n3.right = n5;

        n2.left = n6;

        n6.right = n7;
        n6.left = n8;

        int[] expected = {5, 3};

        FindModeInBinarySearchTree ins = new FindModeInBinarySearchTree();
        assertArrayEquals(expected, ins.findMode(n1));
    }

    @Test
    public void findMode_single_node() {
        FindModeInBinarySearchTree ins = new FindModeInBinarySearchTree();
        assertArrayEquals(new int[]{2147483647}, ins.findMode(new TreeNode(2147483647)));
    }

    @Test
    public void findMode_no_nodes() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);

        n1.left = n2;
        n1.right = n3;

        n3.left = n4;
        n3.right = n5;

        n2.left = n6;

        n6.right = n7;
        n6.left = n8;

        int[] expected = {8, 6, 7, 2, 1, 4, 3, 5};

        FindModeInBinarySearchTree ins = new FindModeInBinarySearchTree();
        assertArrayEquals(expected, ins.findMode(n1));
    }
}