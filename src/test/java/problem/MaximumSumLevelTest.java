package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSumLevelTest {

    @Test
    public void findMaxSumLevel() {
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
        assertEquals(2, new MaximumSumLevel().findMaxSumLevel(n5));
    }
}