package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void levelOrder() {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        n1.right = n2;
        n1.left = n3;

        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n3.right = n4;
        n5.left = n5;

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(3);
        expected.add(row1);
        List<Integer> row2 = new ArrayList<>();
        row2.add(9);
        row2.add(20);
        expected.add(row2);
        List<Integer> row3 = new ArrayList<>();
        row3.add(15);
        row3.add(7);
        expected.add(row3);

        assertEquals(expected, new BinaryTreeLevelOrderTraversal().levelOrder(n1))
    }
}