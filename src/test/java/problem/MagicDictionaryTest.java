package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MagicDictionaryTest {

    @Test
    public void search() {
        MagicDictionary ins = new MagicDictionary();
        ins.buildDict(new String[]{"hello", "leetcode"});
        assertTrue(ins.search("hhllo"));
    }

    @Test
    public void search1() {
        MagicDictionary ins = new MagicDictionary();
        ins.buildDict(new String[]{"hello", "leetcode"});
        assertFalse(ins.search("hello"));
    }

    @Test
    public void search2() {
        MagicDictionary ins = new MagicDictionary();
        ins.buildDict(new String[]{"hello", "leetcode"});
        assertFalse(ins.search("hell"));
    }

    @Test
    public void search3() {
        MagicDictionary ins = new MagicDictionary();
        ins.buildDict(new String[]{"hello", "leetcode"});
        assertFalse(ins.search("leetcoded"));
    }
}