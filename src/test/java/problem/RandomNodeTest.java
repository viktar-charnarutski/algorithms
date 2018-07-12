package problem;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class RandomNodeTest {

    @Test
    public void getRandomNode() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        n4.left = n8;
        n4.right = n9;

        RandomNode ins = new RandomNode();
        TreeNode r1 = ins.getRandomNode(n1);
        TreeNode r2 = ins.getRandomNode(n1);
        assertNotEquals(r1, r2);
        TreeNode r3 = ins.getRandomNode(n1);
        assertNotEquals(r1, r3);
        assertNotEquals(r2, r3);
        TreeNode r4 = ins.getRandomNode(n1);
        assertNotEquals(r1, r4);
        assertNotEquals(r2, r4);
        assertNotEquals(r3, r4);
        TreeNode r5 = ins.getRandomNode(n1);
        assertNotEquals(r1, r5);
        assertNotEquals(r2, r5);
        assertNotEquals(r3, r5);
        assertNotEquals(r4, r5);
        TreeNode r6 = ins.getRandomNode(n1);
        assertNotEquals(r1, r6);
        assertNotEquals(r2, r6);
        assertNotEquals(r3, r6);
        assertNotEquals(r4, r6);
        assertNotEquals(r5, r6);
    }
}