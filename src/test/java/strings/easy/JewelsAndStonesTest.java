package strings.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class JewelsAndStonesTest {

    @Test
    public void numJewelsInStones() {

        JewelsAndStones ins = new JewelsAndStones();

        assertTrue(3 == ins.numJewelsInStones("aA", "aAAbbbb"));
        assertTrue(0 == ins.numJewelsInStones("zz", "ZZ"));
        assertTrue(0 == ins.numJewelsInStones("zz", ""));
        assertTrue(0 == ins.numJewelsInStones("", "ZZ"));
        assertTrue(0 == ins.numJewelsInStones("", ""));

    }
}