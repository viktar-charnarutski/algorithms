package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GenerateParenthesesTest {

    @Test
    public void combParenthesis1() {
        List<String> res = new ArrayList<>();
        res.add("((()))");
        res.add("(()())");
        res.add("(())()");
        res.add("()(())");
        res.add("()()()");
        assertEquals(res, new GenerateParentheses().generateParenthesis(3));
    }
}