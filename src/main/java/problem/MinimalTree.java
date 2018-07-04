package problem;

/**
 * Minimal Tree
 * <p>
 * Given a sorted (increasing order) array with unique integer elements, write an algorithm to create
 * a binary search tree with minimal height.
 */
public class MinimalTree {

    public TreeNode minimalTree(int[] numsArray) {
        return minimalTree(numsArray, 0, numsArray.length - 1);
    }

    private TreeNode minimalTree(int[] numsArray, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(numsArray[mid]);
        node.left = minimalTree(numsArray, start, mid - 1);
        node.right = minimalTree(numsArray, mid + 1, end);
        return node;
    }
}
