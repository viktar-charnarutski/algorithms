package problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Random Node
 * <p>
 * You are implementing a binary tree class from scratch which, in addition to
 * insert, find, and delete, has a method getRandomNode() which returns a random node
 * from the tree. All nodes should be equally likely to be chosen.
 */
public class RandomNode<T> {

    private T value;
    private RandomNode<T> left;
    private RandomNode<T> right;

    private Random rand;

    public RandomNode(T value) {
        this.value = value;
        this.rand = new Random();
    }

    public T value() {
        return value;
    }

    public RandomNode<T> left() {
        return left;
    }

    public RandomNode<T> right() {
        return right;
    }

    public void setRight(RandomNode<T> node) {
        this.right = node;
    }

    public void setLeft(RandomNode<T> node) {
        this.left = node;
    }

    public boolean find(T value) {
        return dfs(this, value);
    }

    private boolean dfs(RandomNode<T> node, T value) {
        if (node == null) return false;

        if (node.value.equals(value)) {
            return true;
        }
        return dfs(node.left, value) || dfs(node.right, value);
    }

    public RandomNode<T> getRandomNode() {
        ArrayList<RandomNode<T>> nodesList = getAllNodesAsList();
        int randomIndex = rand.nextInt(nodesList.size() - 1);
        return nodesList.get(randomIndex);
    }

    ArrayList<RandomNode<T>> getAllNodesAsList() {
        ArrayList<RandomNode<T>> nodesList = new ArrayList<>();

        Queue<RandomNode<T>> nodes = new LinkedList<>();
        nodes.offer(this);
        while (!nodes.isEmpty()) {
            RandomNode<T> current = nodes.remove();
            if (current == null) continue;

            nodesList.add(current);
            nodes.offer(current.left());
            nodes.offer(current.right());
        }
        return nodesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RandomNode)) return false;

        RandomNode<?> that = (RandomNode<?>) o;

        if (!value.equals(that.value)) return false;
        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        return right != null ? right.equals(that.right) : that.right == null;
    }

    @Override
    public int hashCode() {
        int result = value.hashCode();
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RandomNode{" +
                "value=" + value +
                '}';
    }
}
