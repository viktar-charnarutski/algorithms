package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllPossibleFullBinaryTreesTest {

    @Test
    public void allPossibleFBT1() {
        TreeNode n1 = new TreeNode(0);
        TreeNode n2 = new TreeNode(0);
        TreeNode n3 = new TreeNode(0);
        n1.left = n2;
        n1.right = n3;
        assertEquals(n1, new AllPossibleFullBinaryTrees().allPossibleFBT(3));
    }

    @Test
    public void allPossibleFBT2() {
        TreeNode n1 = new TreeNode(0);
        assertEquals(n1, new AllPossibleFullBinaryTrees().allPossibleFBT(1));
    }
}