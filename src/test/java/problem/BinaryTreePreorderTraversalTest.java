package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreePreorderTraversalTest {

    @Test
    public void preorderTraversal() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n2.left = n5;
        n3.right = n6;
        n3.left = n7;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(6);

        assertEquals(list, new BinaryTreePreorderTraversal().preorderTraversal(n1));
    }
}