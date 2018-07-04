package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RouteBetweenNodesTest {

    @Test
    public void isRouteBetweenNodes() {
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

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        RouteBetweenNodes ins = new RouteBetweenNodes();
        assertTrue(ins.isRouteBetweenNodes(n1, n7));
        assertFalse(ins.isRouteBetweenNodes(n1, n8));
        assertFalse(ins.isRouteBetweenNodes(n2, n3));
    }
}