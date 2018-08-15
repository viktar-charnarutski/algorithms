package problem;

import java.util.Arrays;

/**
 * Rotation Point.
 *
 * <p>
 * I opened up a dictionary to a page in the middle and started flipping through, looking for words I didn't know.
 * I put each word I didn't know at increasing indices in a huge list I created in memory. When I reached the end of
 * the dictionary, I started from the beginning and did the same thing until I reached the page I started at.
 * <p>
 * Now I have a list of words that are mostly alphabetical, except they start somewhere in the middle of the alphabet,
 * each the end, and then start from the beginning of the alphabet. In other words, this is an alphabetically ordered
 * list that has been "rotated."
 * <p>
 * Write a function for finding the index of the "rotation point," which is where I started working from the beginning
 * of the dictionary. This list is huge (there are lots of words I don't know) so we want to be efficient here.
 */
public class RotationPoint {
    public int findRotationPoint(String[] words) {
        if (words == null || words.length == 0) {
            return -1;
        }

        String[] sortedWords = words.clone();
        Arrays.sort(sortedWords);

        String firstWord = sortedWords[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(firstWord)) {
                return i;
            }
        }

        return -1;
    }

}
