package leetcode.easy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 653. Two Sum IV - Input is a BST
 * <p>
 * Given a Binary Search Tree and a target number, return true if there exist two elements
 * in the BST such that their sum is equal to the given target.
 */
public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> wanted = new HashSet<>();

        LinkedList<TreeNode> toCheck = new LinkedList<>();
        toCheck.add(root);

        while (!toCheck.isEmpty()) {
            TreeNode currNode = toCheck.remove();

            if (currNode == null) {
                continue;
            }

            if (wanted.contains(currNode.val)) {
                return true;
            }
            wanted.add(k - currNode.val);

            if (currNode.left != null) {
                toCheck.add(currNode.left);
            }
            if (currNode.right != null) {
                toCheck.add(currNode.right);
            }
        }
        return false;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
