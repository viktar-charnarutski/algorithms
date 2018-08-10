package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 113. Path Sum II
 * <p>
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * <p>
 * Note: A leaf is a node with no children.
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        pathSum(root, sum, res, new ArrayList<>());
        return res;
    }

    private void pathSum(TreeNode root, int sum, List<List<Integer>> res, ArrayList<Integer> currPath) {
        if (root == null) {
            return;
        }

        currPath.add(root.val);
        sum -= root.val;

        if (root.left == null && root.right == null && sum == 0) {
            res.add(new ArrayList<>(currPath));
            currPath.remove(currPath.size() - 1);
            return;
        }

        pathSum(root.left, sum, res, currPath);
        pathSum(root.right, sum, res, currPath);

        currPath.remove(currPath.size() - 1);
    }
}
