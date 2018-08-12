package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 662. Maximum Width of Binary Tree
 * <p>
 * Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum
 * width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null.
 * <p>
 * The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in
 * the level, where the null nodes between the end-nodes are also counted into the length calculation.
 */
public class MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth = 0;
        if (root == null) {
            return maxWidth;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int currWidth = 0;
            int rowSize = queue.size();
            int fakeCnt = 0;
            for (int i = rowSize; i > 0; i--) {
                currWidth++;
                TreeNode curr = queue.remove();
                if (curr instanceof FakeNode) {
                    queue.offer(new FakeNode(0));
                    queue.offer(new FakeNode(0));
                    if (++fakeCnt == rowSize) {
                        return maxWidth;
                    }
                    continue;
                } else {
                    maxWidth = Math.max(currWidth, maxWidth);
                }
                queue.offer(curr.left != null ? curr.left : new FakeNode(0));
                queue.offer(curr.right != null ? curr.right : new FakeNode(0));
            }
        }
        return maxWidth;
    }

    class FakeNode extends TreeNode {
        FakeNode(int x) {
            super(x);
        }
    }
}
