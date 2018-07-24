package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberIIITest {

    @Test
    public void rob() {
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n11 = new TreeNode(1);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n3.left = n4;
        n3.right = n5;
        n4.left = n1;
        n4.right = n3;
        n5.right = n11;
        n5.left = n2;

        assertEquals(9, new HouseRobberIII().rob(n3));
    }
}