package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeSerializationTest {

    @Test
    public void serializeTree1() {
        String expected = "1,2,null,null,3,4,null,null,5,null,null,";
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        assertEquals(expected, new BinaryTreeSerialization().serializeTree(n1));
    }

    @Test
    public void restoreTree1() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        assertEquals(n1, new BinaryTreeSerialization().restoreTree("1,2,null,null,3,4,null,null,5,null,null,"));
    }

    @Test
    public void restoreTree2() {
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
        assertEquals(n1, new BinaryTreeSerialization().restoreTree("1,2,4,null,null,5,null,null,3,6,null,null,7,null,null,"));
    }

    @Test
    public void serializeTree2() {
        String expected = "1,2,4,null,null,5,null,null,3,6,null,null,7,null,null,";
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
        assertEquals(expected, new BinaryTreeSerialization().serializeTree(n1));
    }
}