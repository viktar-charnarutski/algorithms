package leetcode;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 * <p>
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * <p>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return composeTree(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode composeTree(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart == preorder.length || inStart > inEnd) return null;

        int val = preorder[preStart];
        TreeNode n = new TreeNode(val);

        int ind = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == val) {
                ind = i;
                break;
            }
        }

        n.left = composeTree(preStart + 1, inStart, ind - 1, preorder, inorder);
        n.right = composeTree(preStart + ind - inStart + 1, ind + 1, inEnd, preorder, inorder);
        return n;
    }
}
