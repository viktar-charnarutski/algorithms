package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindBottomLeftTreeValueTest {

    @Test
    public void findBottomLeftValue() {
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
        n3.left = n5;
        n3.right = n6;
        n5.left = n7;

        FindBottomLeftTreeValue ins = new FindBottomLeftTreeValue();
        assertEquals(7, ins.findBottomLeftValue(n1));
    }
}