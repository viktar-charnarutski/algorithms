package leetcode;

import java.util.HashSet;
import java.util.List;

/**
 * 648. Replace Words
 * <p>
 * In English, we have a concept called root, which can be followed by some other words to form another longer word -
 * let's call this word successor. For example, the root an, followed by other, which can form another word another.
 * <p>
 * Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor
 * in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with
 * the shortest length.
 * <p>
 * You need to output the sentence after the replacement.
 */
public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        HashSet<String> set = new HashSet<>(dict);
        StringBuilder sb = new StringBuilder();

        for (String w : sentence.split(" ")) {
            int i = 1;
            while (i < w.length()) {
                String root = w.substring(0, i++);
                if (set.contains(root)) {
                    w = root;
                    break;
                }
            }
            sb.append(w).append(" ");
        }
        return sb.toString().trim();
    }
}
