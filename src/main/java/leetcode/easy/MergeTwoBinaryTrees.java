package leetcode.easy;

/**
 * 617. Merge Two Binary Trees
 * <p>
 * Given two binary trees and imagine that when you put one of them to cover the other,
 * some nodes of the two trees are overlapped while the others are not.
 * <p>
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap,
 * then sum node values up as the new value of the merged node.
 * Otherwise, the NOT null node will be used as the node of new tree.
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;

        TreeNode treeNode = new TreeNode(t1.val + t2.val);

        treeNode.left = mergeTrees(t1.left, t2.left);
        treeNode.right = mergeTrees(t1.right, t2.right);

        return treeNode;
    }
}
