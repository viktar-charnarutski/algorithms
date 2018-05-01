package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelOrderTraversalIITest {

    @Test
    public void levelOrderBottom() {
        BinaryTreeLevelOrderTraversalII ins = new BinaryTreeLevelOrderTraversalII();

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        n4.left = n8;
        n4.right = n9;

        n5.left = n10;
        n5.right = n11;

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        list5.add(8);
        list5.add(9);
        list5.add(10);
        list5.add(11);
        expected.add(list5);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(5);
        list4.add(6);
        list4.add(7);
        expected.add(list4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        expected.add(list2);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        expected.add(list1);


        List<List<Integer>> output = ins.levelOrderBottom(n1);
        assertEquals(expected, output);

        List<List<Integer>> expected2 = new ArrayList<>();
        List<Integer> list6 = new ArrayList<>();
        list6.add(11);
        expected2.add(list6);
        assertEquals(expected2, ins.levelOrderBottom(n11));


        List<List<Integer>> expected3 = new ArrayList<>();
        assertEquals(expected3, ins.levelOrderBottom(null));
    }
}