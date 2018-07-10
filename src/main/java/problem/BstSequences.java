package problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * BST Sequences
 * <p>
 * A binary search tree was created by traversing through an array from left to right
 * and inserting each element. Given a binary search tree with distinct elements, print all possible
 * arrays that could have led to this tree.
 */
public class BstSequences {

    public List<List<Integer>> bstSequences(TreeNode root) {
        List<List<Integer>> resultSequences = new ArrayList<>();

        List<Integer> currentSequence = new ArrayList<>();

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        currentSequence.add(root.val);

        createSequence(currentSequence, nodes, resultSequences);

        return resultSequences;
    }

    private void createSequence(List<Integer> currentSequence, Queue<TreeNode> nodes, List<List<Integer>> resultSequences) {
        if (nodes.isEmpty()) {
            resultSequences.add(new ArrayList<>(currentSequence));
            return;
        }

        TreeNode curr = nodes.poll();
        if (curr.left != null) {
            currentSequence.add(curr.left.val);
            nodes.offer(curr.left);
        }
        if (curr.right != null) {
            currentSequence.add(curr.right.val);
            nodes.offer(curr.right);
        }

        createSequence(currentSequence, nodes, resultSequences);

        if (curr.left != null && curr.right != null) {
            currentSequence.remove(currentSequence.size() - 1);
            currentSequence.remove(currentSequence.size() - 1);
            currentSequence.add(curr.right.val);
            currentSequence.add(curr.left.val);
            createSequence(currentSequence, nodes, resultSequences);
        }

    }
}
