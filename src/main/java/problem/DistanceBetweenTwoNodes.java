package problem;

/**
 * Distance between two nodes in a Binary Tree
 * <p>
 * Given the root of a Binary Tree  and 2 integers that represent the data values of any two TreeNodes present in the
 * tree, write a method - getNodeDistance that returns the distance between the nodes. You can assume that the given
 * keys exist in the tree. The distance between two nodes is defined as the minimum number of edges that must be
 * traversed to travel between the two nodes.
 */
public class DistanceBetweenTwoNodes {
    public int getNodeDistance(TreeNode root, int n1, int n2) {
        if (root == null) return -1;

        TreeNode parent = parent(root, n1, n2);
        return path(parent, n1, 0) + path(parent, n2, 0);
    }

    TreeNode parent(TreeNode root, int n1, int n2) {
        if (root == null) return null;
        if (root.val == n1 || root.val == n2) {
            return root;
        }
        TreeNode left = parent(root.left, n1, n2);
        TreeNode right = parent(root.right, n1, n2);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }

    int path(TreeNode root, int n, int l) {
        if (root == null) return 0;
        if (root.val == n) return l;
        return Math.max(path(root.left, n, l + 1), path(root.right, n, l + 1));
    }
}
