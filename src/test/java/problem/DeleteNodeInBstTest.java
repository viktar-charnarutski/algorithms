package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteNodeInBstTest {

    @Test
    public void deleteNode1() {
        TreeNode n5 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        n5.left = n3;
        n5.right = n6;
        n3.left = n2;
        n3.right = n4;
        n6.right = n7;

        TreeNode m5 = new TreeNode(5);
        TreeNode m6 = new TreeNode(6);
        TreeNode m2 = new TreeNode(2);
        TreeNode m4 = new TreeNode(4);
        TreeNode m7 = new TreeNode(7);
        m5.left = m4;
        m5.right = m6;
        m4.left = m2;
        m6.right = m7;

        assertEquals(m5, new DeleteNodeInBst().deleteNode(n5, 3));
    }

    @Test
    public void deleteNode2() {
        TreeNode n5 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        n5.left = n3;
        n5.right = n6;
        n3.left = n2;
        n3.right = n4;
        n6.right = n7;

        TreeNode m5 = new TreeNode(5);
        TreeNode m6 = new TreeNode(6);
        TreeNode m2 = new TreeNode(2);
        TreeNode m4 = new TreeNode(4);
        m5.left = m4;
        m5.right = m6;
        m4.left = m2;

        assertEquals(m5, new DeleteNodeInBst().deleteNode(n5, 7));
    }
}