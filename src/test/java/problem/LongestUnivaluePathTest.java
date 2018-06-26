package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class LongestUnivaluePathTest {

    @Test
    public void longestUnivaluePath_through_the_head() {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.right = n6;

        LongestUnivaluePath ins = new LongestUnivaluePath();
        assertSame(2, ins.longestUnivaluePath(n1));
    }

    @Test
    public void longestUnivaluePath_not_through_the_head() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.right = n6;

        LongestUnivaluePath ins = new LongestUnivaluePath();
        assertSame(2, ins.longestUnivaluePath(n1));
    }
}