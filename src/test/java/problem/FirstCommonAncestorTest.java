package problem;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class FirstCommonAncestorTest {

    @Test
    public void firstCommonAncestor() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);
        TreeNode n12 = new TreeNode(12);
        TreeNode n15 = new TreeNode(15);

        n4.left = n2;
        n4.right = n10;

        n2.left = n1;
        n2.right = n3;

        n10.left = n9;
        n10.right = n15;

        n15.right = n11;
        n9.left = n12;

        assertEquals(n10, new FirstCommonAncestor().firstCommonAncestor(n4, n11, n12));
    }

    @Test
    public void getPath() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);
        TreeNode n12 = new TreeNode(12);
        TreeNode n15 = new TreeNode(15);

        n4.left = n2;
        n4.right = n10;

        n2.left = n1;
        n2.right = n3;

        n10.left = n9;
        n10.right = n15;

        n15.right = n11;
        n9.left = n12;

        Stack<TreeNode> expectedStack = new Stack<>();
        expectedStack.push(n4);
        expectedStack.push(n10);
        expectedStack.push(n15);

        assertEquals(expectedStack, new FirstCommonAncestor().getPathAsStack(n4, n11));
    }
}