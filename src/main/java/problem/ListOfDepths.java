package problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * List of Depths
 *
 * Given a binary tree, design an algorithm which creates a linked list of all the nodes
 * at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
 */
public class ListOfDepths {

    public List<LinkedList<TreeNode>> listOfDepths(TreeNode node) {
        List<LinkedList<TreeNode>> listOfDepths = new ArrayList<>();

        Queue<TreeNode> levels = new LinkedList<>();
        levels.offer(node);

        while (!levels.isEmpty()) {
            LinkedList<TreeNode> currentDepth = new LinkedList<>();

            int size = levels.size();
            while (size-- > 0) {
                TreeNode curr = levels.poll();
                if (curr.left != null) levels.offer(curr.left);
                if (curr.right != null) levels.offer(curr.right);
                currentDepth.add(curr);
            }
            listOfDepths.add(currentDepth);
        }

        return listOfDepths;
    }
}
