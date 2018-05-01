package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class FindSmallestLetterGreaterThanTargetTest {

    private FindSmallestLetterGreaterThanTarget ins = new FindSmallestLetterGreaterThanTarget();

    @Test
    public void nextGreatestLetter() {
        assertSame('c', ins.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'a'));
        assertSame('f', ins.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'c'));
        assertSame('f', ins.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'd'));
        assertSame('j', ins.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'g'));
        assertSame('c', ins.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'j'));
        assertSame('c', ins.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'k'));
    }
}