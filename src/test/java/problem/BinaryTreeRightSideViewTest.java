package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class BinaryTreeRightSideViewTest {

    @Test
    public void rightSideView1() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.right = n5;
        n3.right = n4;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        assertEquals(list, new BinaryTreeRightSideView().rightSideView(n1));
    }

    @Test
    public void rightSideView2() {
        assertEquals(Collections.emptyList(), new BinaryTreeRightSideView().rightSideView(null));
    }
}