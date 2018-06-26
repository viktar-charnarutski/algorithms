package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FindLargestValueInEachTreeRowTest {

    @Test
    public void largestValues() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(9);

        n1.right= n2;
        n1.left= n3;
        n2.right= n6;
        n3.left= n5;
        n3.right= n4;

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(9);

        FindLargestValueInEachTreeRow ins = new FindLargestValueInEachTreeRow();
        assertEquals(expected, ins.largestValues(n1));
    }
}