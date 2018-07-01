package problem;

import java.util.Stack;

/**
 * Queue via Stacks
 * <p>
 * Implement a QueueViaStacks class which implements a queue using two stacks.
 * 1 2 3 4 5
 *
 */
public class QueueViaStacks<T> {

    private Stack<T> stackNew;
    private Stack<T> stackOld;

    public QueueViaStacks() {
        stackNew = new Stack<>();
        stackOld = new Stack<>();
    }

    public void add(T value) {
        stackNew.push(value);
    }

    public T peek() {
        shiftStacks();
        return stackOld.peek();
    }

    private void shiftStacks() {
        if (stackOld.isEmpty()) {
            while (!stackNew.isEmpty()) {
                stackOld.push(stackNew.pop());
            }
        }
    }

    public T remove() {
        shiftStacks();
        return stackOld.pop();
    }

    public int size() {
        return stackNew.size() + stackOld.size();
    }
}
