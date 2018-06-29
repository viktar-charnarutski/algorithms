package problem;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Two Stacks in an Array
 * <p>
 * Create a data structure twoStacks that represents two stacks. Implementation of twoStacks should use only one array,
 * i.e., both stacks should use the same array for storing elements. Following functions must be supported by twoStacks.
 * <p>
 * push1(int x) –> pushes x to first stack
 * push2(int x) –> pushes x to second stack
 * <p>
 * pop1() –> pops an element from first stack and return the popped element
 * pop2() –> pops an element from second stack and return the popped element
 * <p>
 * Implementation of twoStack should be space efficient.
 */
public class TwoStacksInArray {
    private int[] stack;

    private int currIndex1;
    private int currIndex2;


    public TwoStacksInArray(int capacity) {
        if (capacity < 2) throw new IllegalArgumentException();
        stack = new int[capacity];
        currIndex1 = 0;
        currIndex2 = stack.length - 1;
    }

    public void push1(int n) {
        if (currIndex1 + 1 == currIndex2) {
            throw new StackOverflowError("Stack 1 is full.");
        }
        stack[currIndex1++] = n;
    }

    public void push2(int n) {
        if (currIndex2 - 1 == currIndex1) {
            throw new StackOverflowError("Stack 2 is full.");
        }
        stack[currIndex2--] = n;
    }

    public int pop1() {
        if (currIndex1 == 0) {
            throw new EmptyStackException();
        }
        return stack[--currIndex1];
    }

    public int pop2() {
        if (currIndex2 == stack.length - 1) {
            throw new EmptyStackException();
        }
        return stack[++currIndex2];
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}
