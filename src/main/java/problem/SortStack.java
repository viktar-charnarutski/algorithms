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
        Stack<Integer> tmpStack = new Stack<>();
        while (!stack.isEmpty()) {
            Integer tmp = stack.pop();
            while (!tmpStack.isEmpty() && tmpStack.peek() < tmp) {
                stack.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        stack = tmpStack;
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
