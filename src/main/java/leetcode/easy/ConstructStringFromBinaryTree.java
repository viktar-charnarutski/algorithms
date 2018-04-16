package leetcode.easy;

/**
 * 606. Construct String from Binary Tree
 * <p>
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder
 * traversing way.
 * <p>
 * The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis
 * pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.
 */
public class ConstructStringFromBinaryTree {

    private StringBuilder result = new StringBuilder();

    public String tree2str(TreeNode t) {
        if (t == null) return "";

        result.append(t.val);

        if (t.left != null && t.right != null) {
            appendNode(t.left);
            appendNode(t.right);
        } else if (t.right != null) {
            result.append("()");
            appendNode(t.right);
        } else if (t.left != null) {
            appendNode(t.left);
        }
        return result.toString();
    }

    private void appendNode(TreeNode node) {
        result.append("(");
        tree2str(node);
        result.append(")");
    }
}
