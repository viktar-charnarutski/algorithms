package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SerializeAndDeserializeBSTTest {

    @Test
    public void serialize() {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.right = n5;

        assertEquals("5,3,2,6,7,", new SerializeAndDeserializeBST().serialize(n1));
    }

    @Test
    public void deserialize() {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.right = n5;

        assertEquals(n1, new SerializeAndDeserializeBST().deserialize("5,3,2,6,7,"));
    }
}