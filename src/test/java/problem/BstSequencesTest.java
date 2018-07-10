package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BstSequencesTest {

    @Test
    public void bstSequences() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n2.left = n1;
        n2.right = n3;

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(1);
        list1.add(3);
        expected.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(1);
        expected.add(list2);

        assertEquals(expected, new BstSequences().bstSequences(n2));
    }
}