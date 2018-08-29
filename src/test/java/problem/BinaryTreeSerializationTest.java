package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeSerializationTest {

    @Test
    public void serializeTree() {
        String expected = "1,2,3,null,null,4,5,";
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

}