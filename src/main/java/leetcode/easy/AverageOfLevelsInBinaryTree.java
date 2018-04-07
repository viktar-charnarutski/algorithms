package leetcode.easy;

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
        checkList.add(root.left);
        checkList.add(root.right);

        while (!checkList.isEmpty()) {

            LinkedList<TreeNode> childCheckList = new LinkedList<>();

            int count = 0;
            long sum = 0;
            while (!checkList.isEmpty()) {
                TreeNode node = checkList.remove();
                if (node == null) continue;
                sum += node.val;
                childCheckList.add(node.left);
                childCheckList.add(node.right);
                count++;
            }

            if (count != 0) {
                double avg = ((double) sum) / count;
                averages.add(avg);
                checkList.addAll(childCheckList);
            }
        }

        return averages;
    }
}
