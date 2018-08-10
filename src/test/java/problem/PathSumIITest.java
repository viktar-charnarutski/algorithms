package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PathSumIITest {

    @Test
    public void pathSum1() {
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n8 = new TreeNode(8);
        TreeNode n11 = new TreeNode(11);
        TreeNode n13 = new TreeNode(13);
        TreeNode n4_1 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n2 = new TreeNode(2);
        TreeNode n5_1 = new TreeNode(5);
        TreeNode n1 = new TreeNode(1);
        n5.left = n4;
        n5.right = n8;

        n4.left = n11;

        n11.left = n7;
        n11.right = n2;

        n8.left = n13;
        n8.right = n4_1;

        n4_1.left = n5_1;
        n4_1.right = n1;

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(4);
        list1.add(11);
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(8);
        list2.add(4);
        list2.add(5);
        expected.add(list1);
        expected.add(list2);
        assertEquals(expected, new PathSumII().pathSum(n5, 22));
    }

    @Test
    public void pathSum2() {
        assertEquals(new ArrayList<>(), new PathSumII().pathSum(new TreeNode(5), 22));
    }

    @Test
    public void pathSum3() {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        expected.add(list1);
        assertEquals(expected, new PathSumII().pathSum(new TreeNode(5), 5));
    }

    @Test
    public void pathSum4() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n1.left = n2;
        assertEquals(new ArrayList<>(), new PathSumII().pathSum(n1, 1));
    }
}