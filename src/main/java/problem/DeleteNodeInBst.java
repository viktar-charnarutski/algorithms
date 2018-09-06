package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 450. Delete Node in a BST
 * <p>
 * Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
 * <p>
 * Basically, the deletion can be divided into two stages:
 * <p>
 * - Search for a node to remove.
 * - If the node is found, delete the node.
 */
public class DeleteNodeInBst {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null || (root.left == null && root.right == null && root.val == key)) {
            return null;
        }
        TreeNode fake = new TreeNode(0);
        fake.right = root;

        // find the target node and it's parent
        TreeNode target = null, parent = fake;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(fake);
        while (!nodes.isEmpty()) {
            parent = nodes.remove();
            if (parent.left != null) {
                if (parent.left.val == key) {
                    target = parent.left;
                    break;
                } else {
                    nodes.offer(parent.left);
                }
            }
            if (parent.right != null) {
                if (parent.right.val == key) {
                    target = parent.right;
                    break;
                } else {
                    nodes.offer(parent.right);
                }
            }
        }

        // no target node found
        if (target == null) {
            return root;
        }

        // remove the target node which is a leaf
        if (target.right == null && target.left == null) {
            if (parent.val < key) {
                parent.right = null;
            } else {
                parent.left = null;
            }
        } else if (target.left == null) {
            // remove the target node with just right branch
            if (parent.val < key) {
                parent.right = target.right;
            } else {
                parent.left = target.right;
            }
        } else if (target.right == null){
            // remove the target node with just left branch
            if (parent.val < key) {
                parent.right = target.left;
            } else {
                parent.left = target.left;
            }
        } else {
            // remove the target node with left and right branches
            // get a value of the smallest element of the right branch
            target.val = valueOfMinimalNode(target.right);
            deleteMinimalNode(target.right, target);
        }

        return fake.right;
    }

    private void deleteMinimalNode(TreeNode root, TreeNode prev) {
        TreeNode tmp = prev;
        while (root.left != null) {
            tmp = root;
            root = root.left;
        }
        if (!tmp.equals(prev)) {
            prev.left = null;
        } else {
            prev.right = root.right;
        }
    }

    private int valueOfMinimalNode(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }
}
