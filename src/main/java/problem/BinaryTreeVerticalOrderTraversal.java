package problem;

import java.util.*;

/**
 * Binary Tree Vertical Order Traversal
 * <p>
 * Given a binary tree, return the vertical order traversal of its nodes' values. (ie, from top to bottom, column by
 * column).
 */
public class BinaryTreeVerticalOrderTraversal {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> levels = new LinkedList<>();

        Map<Integer, List<Integer>> levelsMapping = new HashMap<>();

        levels.offer(0);
        nodes.offer(root);

        int minLevel = 0, maxLevel = 0;

        while (!nodes.isEmpty()) {
            TreeNode curr = nodes.remove();
            int level = levels.remove();

            minLevel = Math.min(level, minLevel);
            maxLevel = Math.max(level, maxLevel);

            if (!levelsMapping.containsKey(level)) {
                levelsMapping.put(level, new ArrayList<>());
            }
            levelsMapping.get(level).add(curr.val);

            if (curr.left != null) {
                levels.offer(level - 1);
                nodes.offer(curr.left);
            }
            if (curr.right != null) {
                levels.offer(level + 1);
                nodes.offer(curr.right);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = minLevel; i <= maxLevel; i++) {
            res.add(levelsMapping.get(i));
        }

        return res;
    }
}
