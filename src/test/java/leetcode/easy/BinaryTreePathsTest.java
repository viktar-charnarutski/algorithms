package leetcode.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class BinaryTreePathsTest {

    @Test
    public void binaryTreePaths() {
        BinaryTreePaths ins = new BinaryTreePaths();

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n4.right = n5;
        n4.left = n6;

        ArrayList<String> expected = new ArrayList<>();
        expected.add("1->2->4->6");
        expected.add("1->2->4->5");
        expected.add("1->3");
        assertEquals(expected, ins.binaryTreePaths(n1));

        ArrayList<String> expected1 = new ArrayList<>();
        expected1.add("5");
        assertEquals(expected1, ins.binaryTreePaths(n5));
        assertEquals(Collections.EMPTY_LIST, ins.binaryTreePaths(null));
    }
}