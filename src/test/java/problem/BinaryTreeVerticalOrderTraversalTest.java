package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeVerticalOrderTraversalTest {

    @Test
    public void verticalOrder() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
/*
          1
        /   \
       2     3
      / \   / \
     4   5 6   7
 */
        List<Integer> res1 = new ArrayList<>();
        res1.add(4);
        List<Integer> res2 = new ArrayList<>();
        res2.add(2);
        List<Integer> res3 = new ArrayList<>();
        res3.add(1);
        res3.add(5);
        res3.add(6);
        List<Integer> res4 = new ArrayList<>();
        res4.add(3);
        List<Integer> res5 = new ArrayList<>();
        res5.add(7);

        List<List<Integer>> res = new ArrayList<>();
        res.add(res1);
        res.add(res2);
        res.add(res3);
        res.add(res4);
        res.add(res5);

        assertEquals(res, new BinaryTreeVerticalOrderTraversal().verticalOrder(n1));
    }
}