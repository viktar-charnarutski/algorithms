package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReplaceWordsTest {

    @Test
    public void replaceWords1() {
        ReplaceWords ins = new ReplaceWords();
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("rat");
        list.add("bat");
        assertEquals("the cat was rat by the bat", ins.replaceWords(list, "the cattle was rattled by the battery"));
    }

    @Test
    public void replaceWords2() {
        ReplaceWords ins = new ReplaceWords();
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("catt");
        list.add("rat");
        list.add("rattl");
        list.add("bat");
        list.add("batt");
        assertEquals("the cat was rat by the bat", ins.replaceWords(list, "the cattle was rattled by the battery"));
    }
}