package problem;

import java.util.HashMap;

/**
 * 337. House Robber III
 * <p>
 * The thief has found himself a new place for his thievery again. There is only one entrance to this area,
 * called the "root." Besides the root, each house has one and only one parent house.
 * After a tour, the smart thief realized that "all houses in this place forms a binary tree".
 * It will automatically contact the police if two directly-linked houses were broken into on the same night.
 * <p>
 * Determine the maximum amount of money the thief can rob tonight without alerting the police.
 */
public class HouseRobberIII {
    public int rob(TreeNode root) {
        return rob(root, new HashMap<TreeNode, Integer>());
    }

    public int rob(TreeNode root, HashMap<TreeNode, Integer> memo) {
        if (root == null) return 0;

        if (memo.containsKey(root)) return memo.get(root);

        int sum = root.val;

        if (root.left != null) {
            sum += rob(root.left.left) + rob(root.left.right);
        }

        if (root.right != null) {
            sum += rob(root.right.left) + rob(root.right.right);
        }

        sum = Math.max(sum, rob(root.right) + rob(root.left));
        memo.put(root, sum);

        return sum;
    }
}
