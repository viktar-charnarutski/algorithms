package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MinimumDistanceBetweenBSTNodesTest {

    private MinimumDistanceBetweenBSTNodes ins = new MinimumDistanceBetweenBSTNodes();

    @Test
    public void minDiffInBST() {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        // assertSame(1, ins.minDiffInBST(node1));

        TreeNode node6 = new TreeNode(27);
        TreeNode node7 = new TreeNode(34);
        TreeNode node8 = new TreeNode(58);
        TreeNode node9 = new TreeNode(50);
        TreeNode node10 = new TreeNode(44);

        node6.right = node7;
        node7.right = node8;
        node8.left = node9;
        node9.left = node10;

        // assertSame(6, ins.minDiffInBST(node6));

        //[90,69,null,49,89,null,52,null,null,null,null]
        TreeNode node11 = new TreeNode(90);
        TreeNode node12 = new TreeNode(69);
        TreeNode node13 = new TreeNode(49);
        TreeNode node14 = new TreeNode(89);
        TreeNode node15 = new TreeNode(52);

        node11.left = node12;
        node12.left = node13;
        node12.right = node14;

        node13.right = node15;

        assertSame(1, ins.minDiffInBST(node11));
    }
}