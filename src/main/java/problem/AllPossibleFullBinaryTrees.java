package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 894. All Possible Full Binary Trees
 * <p>
 * A full binary tree is a binary tree where each node has exactly 0 or 2 children.
 * <p>
 * Return a list of all possible full binary trees with N nodes.  Each element of the answer is the root node of one
 * possible tree.
 * <p>
 * Each node of each tree in the answer must have node.val = 0.
 * <p>
 * You may return the final list of trees in any order.
 */
public class AllPossibleFullBinaryTrees {
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> trees = new ArrayList<>();
        if (N == 1) {
            trees.add(new TreeNode(0));
            return trees;
        }
        N--;
        for (int i = 1; i < N; i += 2) {
            List<TreeNode> leftNodes = allPossibleFBT(i);
            List<TreeNode> rightNodes = allPossibleFBT(N - i);
            for (TreeNode left : leftNodes) {
                for (TreeNode right : rightNodes) {
                    TreeNode node = new TreeNode(0);
                    node.left = left;
                    node.right = right;
                    trees.add(node);
                }
            }
        }
        return trees;
    }
}
