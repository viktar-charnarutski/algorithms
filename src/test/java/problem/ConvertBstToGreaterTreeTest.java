package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertBstToGreaterTreeTest {

    @Test
    public void convertBST() {
        TreeNode n1 = new TreeNode(5);
        n1.left = new TreeNode(2);
        n1.right = new TreeNode(13);

        TreeNode r1 = new TreeNode(18);
        r1.left = new TreeNode(20);
        r1.right = new TreeNode(13);

        assertEquals(r1, new ConvertBstToGreaterTree().convertBST(n1));
    }
}