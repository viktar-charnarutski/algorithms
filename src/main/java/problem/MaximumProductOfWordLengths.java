package problem;

/**
 * 318. Maximum Product of Word Lengths
 * <p>
 * Given a string array words, find the maximum value of length(word[i]) * length(word[j])
 * where the two words do not share common letters. You may assume that each word will contain only lower case letters.
 * If no such two words exist, return 0.
 */
public class MaximumProductOfWordLengths {
    public int maxProduct(String[] words) {
        int[] vals = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            vals[i] = uniqNum(words[i]);
        }

        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((vals[i] & vals[j]) == 0) {
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }

    private int uniqNum(String str) {
        int num = 0;
        for (char c : str.toCharArray()) {
            num |= 1 << (c - 'a');
        }
        return num;
    }
}
