package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FullTreeDecompressionTest {

    @Test
    public void decompressTree1() {
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
        assertEquals(n1, new FullTreeDecompression().decompressTree("1,2,3,4,5,6,7"));
    }

    @Test
    public void decompressTree2() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.left = n6;
        n3.right = n7;
        assertEquals(n1, new FullTreeDecompression().decompressTree("1,2,3,4,*,6,7"));
    }
}