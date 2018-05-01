package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructStringFromBinaryTreeTest {

    @Test
    public void tree2str() {
        ConstructStringFromBinaryTree ins = new ConstructStringFromBinaryTree();

        // 1,2,3,4
        String expected1 = "1(2(4))(3)";
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n2.left = n4;
        n1.right = n3;

        assertEquals(expected1, ins.tree2str(n1));

        ConstructStringFromBinaryTree ins2 = new ConstructStringFromBinaryTree();
        // 1,2,3,null,4
        String expected2 = "1(2()(4))(3)";
        TreeNode n21 = new TreeNode(1);
        TreeNode n22 = new TreeNode(2);
        TreeNode n23 = new TreeNode(3);
        TreeNode n24 = new TreeNode(4);
        n21.left = n22;
        n22.right = n24;
        n21.right = n23;

        assertEquals(expected2, ins2.tree2str(n21));
    }
}