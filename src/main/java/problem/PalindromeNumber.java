package problem;

/**
 * 9. Palindrome Number
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;

        int reX = 0;

        while (x > reX) {
            reX = (reX * 10) + (x % 10);
            x /= 10;
        }

        return x == reX || x == (reX / 10);
    }
}
