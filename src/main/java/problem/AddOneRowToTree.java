package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 623. Add One Row to Tree
 * Given the root of a binary tree, then value v and depth d, you need to add a row of nodes with value v at the given depth d. The root node is at depth 1.
 * <p>
 * The adding rule is: given a positive integer depth d, for each NOT null tree nodes N in depth d-1, create two tree nodes with value v as N's left subtree root and right subtree root. And N's original left subtree should be the left subtree of the new left subtree root, its original right subtree should be the right subtree of the new right subtree root. If depth d is 1 that means there is no depth d-1 at all, then create a tree node with value v as the new root of the whole original tree, and the original tree is the new root's left subtree.
 */
public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }

        Queue<TreeNode> queue = getNodesOfLevel(root, d);

        while (!queue.isEmpty()) {
            insertNewNodeWithValue(v, queue.poll());
        }

        return root;
    }

    private void insertNewNodeWithValue(int v, TreeNode node) {
        TreeNode left = node.left;
        node.left = new TreeNode(v);
        node.left.left = left;

        TreeNode right = node.right;
        node.right = new TreeNode(v);
        node.right.right = right;
    }

    private Queue<TreeNode> getNodesOfLevel(TreeNode root, int d) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 0; i < d - 2; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return queue;
    }
}
