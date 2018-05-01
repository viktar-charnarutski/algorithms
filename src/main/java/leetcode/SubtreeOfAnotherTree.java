package leetcode;

import java.util.LinkedList;

/**
 * 572. Subtree of Another Tree
 * <p>
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure
 * and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all
 * of this node's descendants. The tree s could also be considered as a subtree of itself.
 */
public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (isSameTree(s, t)) return true;
        return isSameTree(s.left, t) || isSameTree(s.right, t);
    }

    private boolean isSameTree(TreeNode t, TreeNode s) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;

        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }

    public boolean isSubtreeDFS(TreeNode s, TreeNode t) {
        if (s == null || t == null) return false;
        boolean result = false;

        LinkedList<TreeNode> checkList = new LinkedList<>();
        if (s.val == t.val) {
            result = true;
            if (s.left != null || t.left != null) {
                checkList.add(s.left);
                checkList.add(t.left);
            }
            if (s.right != null || t.right != null) {
                checkList.add(s.right);
                checkList.add(t.right);
            }

            while (!checkList.isEmpty()) {
                TreeNode tNode = checkList.remove();
                TreeNode sNode = checkList.remove();
                if (tNode == null || sNode == null) {
                    result = false;
                    continue;
                }
                if (tNode.val != sNode.val) {
                    result = false;
                    break;
                } else {
                    if (sNode.left != null || tNode.left != null) {
                        checkList.add(sNode.left);
                        checkList.add(tNode.left);
                    }
                    if (sNode.right != null || tNode.right != null) {
                        checkList.add(sNode.right);
                        checkList.add(tNode.right);
                    }
                }
            }
        }

        return result || isSubtree(s.left, t) || isSubtree(s.right, t);
    }
}
