package problem;

import java.util.*;

/**
 * Word Count Engine
 * <p>
 * Implement a document scanning function wordCountEngine, which receives a string document and returns a list of all
 * unique words in it and their number of occurrences, sorted by the number of occurrences in a descending order.
 * If two or more words have the same count, they should be sorted according to their order in the original sentence.
 * Assume that all letters are in english alphabet. You function should be case-insensitive, so for instance, the words
 * “Perfect” and “perfect” should be considered the same word.
 * <p>
 * The engine should strip out punctuation (even in the middle of a word) and use whitespaces to separate words.
 * <p>
 * Analyze the time and space complexities of your solution. Try to optimize for time while keeping a polynomial space
 * complexity.
 */
public class WordCountEngine {
    static String[][] wordCountEngine(String document) {
        String normDoc = normalize(document);
        String[] wordsArray = normDoc.split(" ");
        Map<String, Integer> count = count(wordsArray);
        Map<String, Integer> indexes = index(wordsArray);

        List<String> result = new ArrayList<>(count.keySet());
        result.sort((a, b) -> count.get(a) == count.get(b) ?
                indexes.get(a) - indexes.get(b) : count.get(b) - count.get(a));

        return toArray(result, count);
    }

    private static Map<String, Integer> index(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        return map;
    }

    private static String[][] toArray(List<String> list, Map<String, Integer> counts) {
        String[][] results = new String[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            results[i][0] = list.get(i);
            results[i][1] = "" + counts.get(list.get(i));
        }
        return results;
    }

    private static Map<String, Integer> count(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    static String normalize(String str) {
        return str.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
    }
}
