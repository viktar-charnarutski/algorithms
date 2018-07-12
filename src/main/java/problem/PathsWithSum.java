package problem;

/**
 * Paths with Sum
 * <p>
 * You are given a binary tree in which each node contains an integer value (which
 * might be positive or negative). Design an algorithm to count the number of paths that sum to a
 * given value. The path does not need to start or end at the root or a leaf, but it must go downwards
 * (traveling only from parent nodes to child nodes).
 */
public class PathsWithSum {

    private int count = 0;

    public int countPathsWithSum(TreeNode root, int target) {
        dfs(root, target, 0);
        return count;
    }

    private void dfs(TreeNode root, int target, int current) {
        if (root == null) return;
        int sum = current + root.val;
        if (sum == target) {
            count++;
        }
        dfs(root.left, target, current);
        dfs(root.right, target, current);
        dfs(root.left, target, sum);
        dfs(root.right, target, sum);
    }
}
