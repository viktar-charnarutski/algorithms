package problem;

import java.util.*;

/**
 * 590. N-ary Tree Postorder Traversal
 * <p>
 * Given an n-ary tree, return the postorder traversal of its nodes' values.
 */
public class NaryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> nodes = new Stack<>();
        nodes.push(root);
        while (!nodes.isEmpty()) {
            root = nodes.pop();
            res.add(root.val);
            for (Node child : root.children) {
                nodes.push(child);
            }
        }
        Collections.reverse(res);
        return res;
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
