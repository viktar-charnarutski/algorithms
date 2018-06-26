package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class ReverseWordsInAStringIIITest {

    @Test
    public void reverseWords() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", new ReverseWordsInAStringIII().reverseWords("Let's take LeetCode contest"));
    }
}