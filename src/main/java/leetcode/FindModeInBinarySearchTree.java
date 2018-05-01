package leetcode;

import java.util.ArrayList;

/**
 * 501. Find Mode in Binary Search Tree
 * <p>
 * Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element)
 * in the given BST.
 * <p>
 * Assume a BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than or equal to the node's key.
 * The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class FindModeInBinarySearchTree {
    private int prev = 0;
    private int maxCount = -1;
    private int currCount = 0;

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        if (root.left == null && root.right == null) return new int[]{root.val};

        prev = root.val;

        ArrayList<Integer> modesList = new ArrayList<>();

        findMode(root, modesList);

        int[] modesArray = new int[modesList.size()];

        for (int i = 0; i < modesArray.length; i++) {
            modesArray[i] = modesList.get(i);
        }

        return modesArray;
    }

    private void findMode(TreeNode root, ArrayList<Integer> modesList) {
        if (root == null) return;
        findMode(root.left, modesList);

        currCount = root.val == prev ? currCount + 1 : 1;

        if (currCount > maxCount) {
            modesList.clear();
            modesList.add(root.val);
            maxCount = currCount;

        } else if (currCount == maxCount) {
            modesList.add(root.val);
        }

        prev = root.val;
        findMode(root.right, modesList);
    }
}
