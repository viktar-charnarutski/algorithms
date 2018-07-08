package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuccessorTest {

    @Test
    public void successor() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        TreeNode n15 = new TreeNode(7);

        n4.left = n2;
        n4.right = n10;

        n2.left = n1;
        n2.right = n3;

        n10.left = n9;
        n10.right = n15;

        assertEquals(n15, new Successor().successor(n4, new TreeNode(12)));
    }
}