package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class UniqueMorseCodeWordsTest {

    @Test
    public void uniqueMorseRepresentations() {

        UniqueMorseCodeWords ins = new UniqueMorseCodeWords();

        assertTrue(2 == ins.uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}));
        assertTrue(1 == ins.uniqueMorseRepresentations(new String[] {"gin", "gin", "gin", "gin"}));
        assertTrue(4 == ins.uniqueMorseRepresentations(new String[] {"gind", "zena", "gigl", "msgn"}));

    }
}