package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 637. Average of Levels in Binary Tree
 * <p>
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 */
public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        averages.add((double) root.val);

        LinkedList<TreeNode> checkList = new LinkedList<>();
        if (root.left != null) checkList.add(root.left);
        if (root.right != null) checkList.add(root.right);

        while (!checkList.isEmpty()) {

            int size = checkList.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = checkList.remove();
                if (node == null) continue;
                sum += node.val;
                if (node.left != null) checkList.add(node.left);
                if (node.right != null) checkList.add(node.right);
            }


            double avg = ((double) sum) / size;
            averages.add(avg);
        }

        return averages;
    }
}
