package leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AverageOfLevelsInBinaryTreeTest {

    private TreeNode root;
    private TreeNode node1;
    private TreeNode node2;
    private TreeNode node3;
    private TreeNode node4;
    private TreeNode node5;
    private TreeNode node6;
    private TreeNode node7;
    private TreeNode node8;
    private TreeNode node9;
    private TreeNode node10;

    private TreeNode nodeNotBalancedRoot;
    private TreeNode nodeNotBalancedNode1;

    private AverageOfLevelsInBinaryTree ins = new AverageOfLevelsInBinaryTree();

    @Before
    public void init() {
        root = new TreeNode(0);

        node1 = new TreeNode(1);
        node2 = new TreeNode(2);
        node3 = new TreeNode(3);
        node4 = new TreeNode(4);
        node5 = new TreeNode(5);
        node6 = new TreeNode(6);
        node7 = new TreeNode(7);
        node8 = new TreeNode(8);
        node9 = new TreeNode(9);
        node10 = new TreeNode(10);

        root.right = node1;
        root.left = node2;

        node1.right = node3;
        node1.left = node4;

        node2.right = node5;
        node2.left = node6;

        node3.right = node7;
        node3.left = node8;

        node4.right = node9;
        node4.left = node10;

        // not balanced
        nodeNotBalancedRoot = new TreeNode(101);
        nodeNotBalancedNode1 = new TreeNode(102);
        nodeNotBalancedRoot.left = nodeNotBalancedNode1;

    }

    @Test
    public void averageOfLevels() {
        List<Double> expected1 = new ArrayList<>();
        expected1.add(0.0);
        expected1.add(1.5);
        expected1.add(4.5);
        expected1.add(8.5);

        List<Double> output1 = ins.averageOfLevels(root);
        assertEquals(expected1, output1);

        //[3,1,5,0,2,4,6]
        List<Double> expected2 = new ArrayList<>();
        expected2.add(3.0);
        expected2.add(3.0);
        expected2.add(3.0);

        root.val = 3;
        node1.val = 1;
        node2.val = 5;
        node3.val = 0;
        node3.left = null;
        node3.right= null;
        node4.val = 2;
        node4.left = null;
        node4.right= null;
        node5.val = 4;
        node5.left = null;
        node5.right= null;
        node6.val = 6;
        node6.left = null;
        node6.right= null;

        List<Double> output2 = ins.averageOfLevels(root);
        assertEquals(expected2, output2);

        //2147483647.0,2147483647.0
        List<Double> expected3 = new ArrayList<>();
        expected3.add(2147483647.0);
        expected3.add(2147483647.0);

        root.val = 2147483647;
        node1.val = 2147483647;
        node1.left = null;
        node1.right= null;
        node2.val = 2147483647;
        node2.left = null;
        node2.right= null;
        node3.val = 0;
        node3.left = null;
        node3.right= null;
        node4.val = 2;
        node4.left = null;
        node4.right= null;
        node5.val = 4;
        node5.left = null;
        node5.right= null;
        node6.val = 6;
        node6.left = null;
        node6.right= null;

        List<Double> output3 = ins.averageOfLevels(root);
        assertEquals(expected3, output3);

        //2147483647.0,2147483647.0
        List<Double> expected4 = new ArrayList<>();
        expected4.add(1.0);

        root.val = 1;
        root.left = null;
        root.right= null;

        List<Double> output4 = ins.averageOfLevels(root);
        assertEquals(expected4, output4);
    }
}