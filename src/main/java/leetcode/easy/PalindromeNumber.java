package leetcode.easy;

/**
 * 9. Palindrome Number
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        long reX = 0;
        int i = x;

        while (i > 0) {
            reX = (reX * 10) + (i % 10);
            i /= 10;
        }

        return reX <= Integer.MAX_VALUE && reX == x;
    }
}
