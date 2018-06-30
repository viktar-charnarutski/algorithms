package problem;

import java.util.Stack;

/**
 * Stack of Plates
 * <p>
 * Imagine a (literal) stack of plates.
 *
 * If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
 * threshold.
 *
 * Implement a data structure SetOfStacks that mimics this. SetOfStacks should be
 * composed of several stacks and should create a new stack once the previous one exceeds capacity.
 *
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack
 * (that is, pop () should return the same values as it would if there were just a single stack).
 */
public class StackOfPlates {

    private Stack<Stack<Integer>> stacks;
    private Stack<Integer> currStack;
    private int threshold;

    public StackOfPlates(int threshold) {
        this.threshold = threshold;
        stacks = new Stack<>();
        currStack = new Stack<>();
    }

    public int push(int n) {
        if (currStack.size() == threshold) {
            stacks.push(currStack);
            currStack = new Stack<>();
        }
        return currStack.push(n);
    }

    public int pop() {
        if (currStack.size() == 0) {
            currStack = stacks.pop();
        }
        return currStack.pop();
    }
}




















