package leetcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.right = n2;
        n1.left = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;


        BinaryTreeInorderTraversal ins = new BinaryTreeInorderTraversal();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(7);

        list.add(1);

        list.add(4);
        list.add(2);
        list.add(5);
        assertEquals(list, ins.inorderTraversal(n1));
    }

    @Test
    public void inorderTraversal1() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n1.right = n2;
        n2.left = n3;


        BinaryTreeInorderTraversal ins = new BinaryTreeInorderTraversal();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        assertEquals(list, ins.inorderTraversal(n1));
    }
}