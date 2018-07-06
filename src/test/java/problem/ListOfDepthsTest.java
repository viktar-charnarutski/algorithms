package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListOfDepthsTest {

    @Test
    public void listOfDepths() {

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

        List<LinkedList<TreeNode>> expected = new ArrayList<>();
        LinkedList<TreeNode> list1 = new LinkedList<>();
        list1.add(n1);
        expected.add(list1);
        LinkedList<TreeNode> list2 = new LinkedList<>();
        list2.add(n2);
        list2.add(n3);
        expected.add(list2);
        LinkedList<TreeNode> list3 = new LinkedList<>();
        list3.add(n4);
        list3.add(n5);
        list3.add(n6);
        list3.add(n7);
        expected.add(list3);
        assertEquals(expected, new ListOfDepths().listOfDepths(n1));
    }
}