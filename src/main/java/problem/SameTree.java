package problem;

import java.util.LinkedList;

/**
 * 100. Same Tree
 * <p>
 * Given two binary trees, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q == null || p == null && q != null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isSameTreeBfs(TreeNode p, TreeNode q) {
        LinkedList<TreeNode> toCheckP = new LinkedList<>();
        LinkedList<TreeNode> toCheckQ = new LinkedList<>();

        toCheckP.add(p);
        toCheckQ.add(q);

        while (!toCheckP.isEmpty() || !toCheckQ.isEmpty()) {
            TreeNode currP = toCheckP.remove();
            TreeNode currQ = toCheckQ.remove();

            if (currP == null && currQ == null) {
                continue;
            }

            if (currP != null && currQ == null || currP == null && currQ != null || currP.val != currQ.val) {
                return false;
            }

            toCheckP.add(currP.left);
            toCheckQ.add(currQ.left);
            toCheckP.add(currP.right);
            toCheckQ.add(currQ.right);
        }

        return true;
    }
}
