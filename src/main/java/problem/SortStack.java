package problem;

import java.util.Stack;

/**
 * Sort Stack
 * <p>
 * Write a program to sort a stack such that the smallest items are on the top. You can use
 * an additional temporary stack, but you may not copy the elements into any other data structure
 * (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.
 */
public class SortStack {

    private Stack<Integer> stack;

    public SortStack() {
        stack = new Stack<>();
    }

    public void sort() {
        Stack<Integer> orderedStack = new Stack<>();
        while (!stack.isEmpty()) {
            int value = stack.pop();
            // if ordered stack has last element greater than the current value
            // push it back to the original stack
            while (!orderedStack.isEmpty() && orderedStack.peek() > value) {
                stack.push(orderedStack.pop());
            }
            orderedStack.push(value);
        }
        while (!orderedStack.isEmpty()) {
            stack.push(orderedStack.pop());
        }
    }

    public void push(int value) {
        stack.push(value);
    }

    public int pop() {
        return stack.pop();
    }

    public int peak() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
