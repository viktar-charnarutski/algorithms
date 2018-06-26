package problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * 500. Keyboard Row
 * <p>
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard.
 * <p>
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 */
public class KeyboardRow {

    public String[] findWords(String[] words) {
        if (words == null || words.length < 1) return new String[0];

        List<String> res = new ArrayList<>();
        for (String w : words) {
            if (composedByFirstRow(w)) {
                res.add(w);
                continue;
            }
            if (composedBySecondRow(w)) {
                res.add(w);
                continue;
            }
            if (composedByThirdRow(w)) {
                res.add(w);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public String[] findWordsSlow(String[] words) {
        return Stream.of(words).filter(s -> composedByFirstRow(s) || composedBySecondRow(s) || composedByThirdRow(s)).toArray(String[]::new);
    }

    private static boolean composedByFirstRow(String w) {
        return composedByRow(w, FIRST_ROW);
    }

    private static boolean composedBySecondRow(String w) {
        return composedByRow(w, SECOND_ROW);
    }

    private static boolean composedByThirdRow(String w) {
        return composedByRow(w, THIRD_ROW);
    }

    private static boolean composedByRow(String w, Set<Character> row) {
        for (char c : w.toCharArray()) {
            if (!row.contains(c))
                return false;
        }
        return true;
    }

    private final static Set<Character> FIRST_ROW = new HashSet<>();
    private final static Set<Character> SECOND_ROW = new HashSet<>();
    private final static Set<Character> THIRD_ROW = new HashSet<>();

    static {
        FIRST_ROW.add('q');
        FIRST_ROW.add('w');
        FIRST_ROW.add('e');
        FIRST_ROW.add('r');
        FIRST_ROW.add('t');
        FIRST_ROW.add('y');
        FIRST_ROW.add('u');
        FIRST_ROW.add('i');
        FIRST_ROW.add('o');
        FIRST_ROW.add('p');
        FIRST_ROW.add('Q');
        FIRST_ROW.add('W');
        FIRST_ROW.add('E');
        FIRST_ROW.add('R');
        FIRST_ROW.add('T');
        FIRST_ROW.add('Y');
        FIRST_ROW.add('U');
        FIRST_ROW.add('I');
        FIRST_ROW.add('O');
        FIRST_ROW.add('P');
        SECOND_ROW.add('a');
        SECOND_ROW.add('s');
        SECOND_ROW.add('d');
        SECOND_ROW.add('f');
        SECOND_ROW.add('g');
        SECOND_ROW.add('h');
        SECOND_ROW.add('j');
        SECOND_ROW.add('k');
        SECOND_ROW.add('l');
        SECOND_ROW.add('A');
        SECOND_ROW.add('S');
        SECOND_ROW.add('D');
        SECOND_ROW.add('F');
        SECOND_ROW.add('G');
        SECOND_ROW.add('H');
        SECOND_ROW.add('J');
        SECOND_ROW.add('K');
        SECOND_ROW.add('L');
        THIRD_ROW.add('z');
        THIRD_ROW.add('x');
        THIRD_ROW.add('c');
        THIRD_ROW.add('v');
        THIRD_ROW.add('b');
        THIRD_ROW.add('n');
        THIRD_ROW.add('m');
        THIRD_ROW.add('Z');
        THIRD_ROW.add('X');
        THIRD_ROW.add('C');
        THIRD_ROW.add('V');
        THIRD_ROW.add('B');
        THIRD_ROW.add('N');
        THIRD_ROW.add('M');
    }
}
