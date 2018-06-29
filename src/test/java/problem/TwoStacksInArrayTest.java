package problem;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;

public class TwoStacksInArrayTest {

    private TwoStacksInArray stack;

    @Before
    public void init() {
        stack = new TwoStacksInArray(5);
    }

    @Test
    public void stack1() {
        stack.push1(1);
        stack.push1(2);
        stack.push1(3);
        assertEquals(3, stack.pop1());
        assertEquals(2, stack.pop1());
        assertEquals(1, stack.pop1());
    }

    @Test
    public void stack2() {
        stack.push2(1);
        stack.push2(2);
        stack.push2(3);
        assertEquals(3, stack.pop2());
        assertEquals(2, stack.pop2());
        assertEquals(1, stack.pop2());
    }

    @Test(expected = EmptyStackException.class)
    public void pop_empty1() {
        stack.pop1();
    }

    @Test(expected = EmptyStackException.class)
    public void pop_empty2() {
        stack.pop1();
    }

    @Test(expected = StackOverflowError.class)
    public void push_1_overflow() {
        stack.push1(1);
        stack.push1(2);
        stack.push1(3);
        stack.push1(4);
        stack.push1(5);
        stack.push1(6);
    }

    @Test(expected = StackOverflowError.class)
    public void push_2_overflow() {
        stack.push2(1);
        stack.push2(2);
        stack.push2(3);
        stack.push2(4);
        stack.push2(5);
        stack.push2(6);
    }
}