package problem;

import java.util.*;

/**
 * 819. Most Common Word
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
 * It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
 * <p>
 * Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not
 * case sensitive.  The answer is in lowercase.
 */
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph == null || paragraph.length() == 0) return paragraph;

        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordsCount = new HashMap<>();

        String mostCommonWord = "";
        int maxOccurrence = 0;

        for (String w : paragraph.split("\\W+")) {
            w = w.toLowerCase();
            if (bannedWords.contains(w)) {
                continue;
            }
            int currOccurrence = wordsCount.getOrDefault(w, 0) + 1;
            if (currOccurrence > maxOccurrence) {
                maxOccurrence = currOccurrence;
                mostCommonWord = w;
            }
            wordsCount.put(w, currOccurrence);
        }

        return mostCommonWord;
    }
}
