package problem;

/**
 * Full Tree Decompression
 * <p>
 * Given a String that represents a Binary Tree, write a method - decompressTree that decompresses that tree
 * (reconstructs the tree) and returns the root TreeNode. The compression algorithm included traversing the tree level
 * by level, from the left to the right. The TreeNode's data values were appended to the String, delimited by commas.
 * Also, null TreeNodes were denoted by appending an asterisk - *. The input String denotes the structure of a Full
 * Binary Tree - i.e. a tree that is structurally balanced. However, the reconstructed tree may not be a full tree as
 * the String included * characters, which represent null TreeNodes.
 * <p>
 * Note:
 * You can assume that if a Binary Tree contains k levels, the compressed String will contain 2k-1 elements - either
 * numbers or *.
 */
public class FullTreeDecompression {
    public TreeNode decompressTree(String str) {
        if (str == null
                || str.length() == 0
                || (str.length() == 1 && str.charAt(0) == '*')) {
            return null;
        }
        return decompressTree(0, str.split(","));
    }

    private TreeNode decompressTree(int index, String[] vals) {
        if (index >= vals.length || vals[index].equals("*")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(vals[index]));
        root.left = decompressTree(2 * index + 1, vals);
        root.right = decompressTree(2 * index + 2, vals);
        return root;
    }
}
