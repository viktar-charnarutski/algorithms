package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JudgeRouteCircleTest {

    @Test
    public void testJudgeCirclePositive() {
        assertTrue(new JudgeRouteCircle().judgeCircle("LLDDRRUU"));
        assertTrue(new JudgeRouteCircle().judgeCircle("LDRU"));
        assertTrue(new JudgeRouteCircle().judgeCircle("ldru"));
        assertTrue(new JudgeRouteCircle().judgeCircle(" ldru "));
    }

    @Test
    public void testJudgeCircleNegative() {
        assertFalse(new JudgeRouteCircle().judgeCircle("LLDDRUU"));
        assertFalse(new JudgeRouteCircle().judgeCircle("LDR"));
        assertFalse(new JudgeRouteCircle().judgeCircle(" LLDDRUU "));
        assertFalse(new JudgeRouteCircle().judgeCircle(" ldr "));
        assertFalse(new JudgeRouteCircle().judgeCircle(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJudgeCircleNotAllowedChar() {
        new JudgeRouteCircle().judgeCircle("LLDeRUU");
    }
}