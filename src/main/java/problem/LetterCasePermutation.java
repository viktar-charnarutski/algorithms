package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 784. Letter Case Permutation
 * <p>
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.
 * Return a list of all possible strings we could create.
 */
public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> permutations = new ArrayList<>();
        letterCasePermutation(S.toCharArray(), 0, permutations);
        return permutations;
    }

    private static void letterCasePermutation(char[] chars, int index, List<String> permutations) {
        if (index == chars.length) {
            permutations.add(String.valueOf(chars));
            return;
        }

        if (Character.isLetter(chars[index])) {
            chars[index] = Character.toUpperCase(chars[index]);
            letterCasePermutation(chars, index + 1, permutations);

            chars[index] = Character.toLowerCase(chars[index]);
            letterCasePermutation(chars, index + 1, permutations);

        } else {
            letterCasePermutation(chars, index + 1, permutations);
        }
    }
}
