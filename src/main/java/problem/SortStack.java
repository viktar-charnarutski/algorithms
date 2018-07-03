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

    public void mergeSort() {
        stack = mergeSort(stack);
    }

    public Stack<Integer> mergeSort(Stack<Integer> stack) {
        if (stack.size() <= 1) return stack;

        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();

        while (!stack.isEmpty()) {
            if (stack.size() % 2 == 0) {
                left.push(stack.pop());
            } else {
                right.push(stack.pop());
            }
        }

        left = mergeSort(left);
        right = mergeSort(right);

        while (left.size() > 0 || right.size() > 0) {
            if (left.size() == 0) {
                stack.push(right.pop());
            } else if (right.size() == 0) {
                stack.push(left.pop());
            } else {
                stack.push(left.peek().compareTo(right.peek()) >= 0 ? left.pop() : right.pop());
            }
        }


        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }
        return reversedStack;
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
