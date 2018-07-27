package problem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 139. Word Break
 * <p>
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be
 * segmented into a space-separated sequence of one or more dictionary words.
 * <p>
 * Note:
 * <p>
 * - The same word in the dictionary may be reused multiple times in the segmentation.
 * - You may assume the dictionary does not contain duplicate words.
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || wordDict.size() == 0) return false;
        return checkWordParts(s, new HashSet<>(wordDict));
    }

    private boolean checkWordParts(String s, Set<String> dict) {
        for (int i = 0; i < s.length(); i++) {
            String subStr1 = s.substring(0, i + 1);
            String subStr2 = s.substring(i + 1, s.length());
            if (dict.contains(subStr1)) {
                if (subStr2.length() == 0 || dict.contains(subStr2) || checkWordParts(subStr2, dict)) {
                    return true;
                }
            }
        }
        return false;
    }
}
