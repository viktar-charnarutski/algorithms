package problem;

/**
 * Pseudo-Isomorphic Substrings
 * <p>
 * Two strings A and B, consisting of small English alphabet letters are called pseudo-isomorphic if
 * <p>
 * Their lengths are equal
 * For every pair (i,j), where 1 <= i < j <= |A|, B[i] = B[j], iff A[i] = A[j]
 * For every pair (i,j), where 1 <= i < j <= |A|, B[i] != B[j] iff A[i] != A[j]
 * <p>
 * Naturally, we use 1-indexation in these definitions and |A| denotes the length of the string A.
 * <p>
 * You are given a string S, consisting of no more than 105 lowercase alphabetical characters. For every prefix of S
 * denoted by S', you are expected to find the size of the largest possible set of strings , such that all elements of
 * the set are substrings of S' and no two strings inside the set are pseudo-isomorphic to each other.
 * <p>
 * if S = abcde
 * then, 1st prefix of S is 'a'
 * then, 2nd prefix of S is 'ab'
 * then, 3rd prefix of S is 'abc'
 * then, 4th prefix of S is 'abcd' and so on.
 * <p>
 * Constraints
 * <p>
 * S contains only lower-case english alphabets ('a' - 'z').
 * Output Format
 * <p>
 * Output N lines. On the ith line, output the size of the largest possible set for the first i alphabetical characters
 * of S such that no two strings in the set are pseudo-isomorphic to each other.
 */
public class PseudoIsomorphicSubstrings {
    static int[] pseudoIsomorphicSubstrings(String s) {
        return new int[0];

    }
}
