package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Check Subtree
 * <p>
 * Tl and T2 are two very large binary trees, with Tl much bigger than T2. Create an
 * algorithm to determine if T2 is a subtree of Tl.
 * <p>
 * A tree T2 is a subtree of Tl if there exists a node n in Tl such that the subtree of n is identical to T2.
 * That is, if you cut off the tree at node n, the two trees would be identical.
 */
public class CheckSubtree {
    public boolean checkSubtree(TreeNode root, TreeNode node) {
        if (root == null || node == null) return false;

        Queue<TreeNode> nodesToCheck = new LinkedList<>();
        nodesToCheck.offer(root);
        while (!nodesToCheck.isEmpty()) {
            TreeNode curr = nodesToCheck.poll();
            if (curr == null) continue;

            if (curr.equals(node)) {
                return true;
            }
            nodesToCheck.offer(curr.left);
            nodesToCheck.offer(curr.right);
        }
        return false;
    }
}
