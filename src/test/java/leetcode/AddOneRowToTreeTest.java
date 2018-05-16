package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddOneRowToTreeTest {

    @Test
    public void addOneRow0() {
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(1);
        TreeNode n6 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        TreeNode m1 = new TreeNode(4);
        TreeNode m2 = new TreeNode(2);
        TreeNode m3 = new TreeNode(6);
        TreeNode m4 = new TreeNode(3);
        TreeNode m5 = new TreeNode(1);
        TreeNode m6 = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);

        t1.left = m1;
        m1.left = m2;
        m1.right = m3;
        m2.left = m4;
        m2.right = m5;
        m3.left = m6;

        assertEquals(t1, new AddOneRowToTree().addOneRow(n1, 1, 1));
    }

    @Test
    public void addOneRow1() {
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(1);
        TreeNode n6 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        TreeNode m1 = new TreeNode(4);
        TreeNode m2 = new TreeNode(2);
        TreeNode m3 = new TreeNode(6);
        TreeNode m4 = new TreeNode(3);
        TreeNode m5 = new TreeNode(1);
        TreeNode m6 = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(1);

        m1.left = t1;
        m1.right = t2;
        t1.left = m2;
        t2.right = m3;
        m2.left = m4;
        m2.right = m5;
        m3.left = m6;

        assertEquals(m1, new AddOneRowToTree().addOneRow(n1, 1, 2));
    }

    @Test
    public void addOneRow2() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        TreeNode m1 = new TreeNode(1);
        TreeNode m2 = new TreeNode(2);
        TreeNode m3 = new TreeNode(3);
        TreeNode m4 = new TreeNode(4);
        TreeNode m5 = new TreeNode(5);
        TreeNode m6 = new TreeNode(6);
        TreeNode t1 = new TreeNode(1);
        TreeNode k2 = new TreeNode(1);

        m1.left = m2;
        m1.right = m3;

        m2.left = t1;

        t1.left = m4;
        t1.right = m5;

        m3.right = k2;
        k2.left = m6;

        assertEquals(m1, new AddOneRowToTree().addOneRow(n1, 1, 3));
    }
}