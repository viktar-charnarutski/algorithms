package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInBinarySearchTreeTest {

    @Test
    public void searchBST() {
        TreeNode n4 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n7 = new TreeNode(7);
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        n4.left = n2;
        n4.right = n7;
        n2.left = n1;
        n2.right = n3;

        TreeNode m2 = new TreeNode(2);
        TreeNode m1 = new TreeNode(1);
        TreeNode m3 = new TreeNode(3);
        m2.left = m1;
        m2.right = m3;

        assertEquals(m2, new SearchInBinarySearchTree().searchBST(n4, 2));
    }
}