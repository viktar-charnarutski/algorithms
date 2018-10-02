package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 906. Super Palindromes
 * <p>
 * Let's say a positive integer is a superpalindrome if it is a palindrome, and it is also the square of a palindrome.
 * <p>
 * Now, given two positive integers L and R (represented as strings), return the number of superpalindromes in the
 * inclusive range [L, R].
 */
public class SuperPalindromes {

    private List<Integer> superPals = new ArrayList<>();

    public int superpalindromesInRange(String L, String R) {
        int cnt = 0;
        if (superPals.isEmpty()) {
            // generatePals();
            prepopulateSuperPals();
        }
        long left = Long.parseLong(L);
        long right = Long.parseLong(R);
        for (int pal : superPals) {
            pal *= pal;
            if (left <= pal && pal <= right) {
                cnt++;
            }
        }
        return cnt;
    }

    private void generatePals() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (isSuperPal(i)) {
                superPals.add(i);
            }
        }
    }

    private boolean isSuperPal(int num) {
        return isPal(num) && isPal((int) Math.sqrt(num));
    }

    private boolean isPal(int num) {
        if (num < 1) return false;

        String numStr = String.valueOf(num);
        int left = 0, right = numStr.length() - 1;
        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private void prepopulateSuperPals() {
        int[] pals = new int[]{0, 1, 2, 3, 11, 22, 101, 111, 121, 202, 212, 1001, 1111, 2002, 10001, 10101, 10201, 11011, 11111, 11211, 20002, 20102, 100001, 101101, 110011, 111111, 200002, 1000001, 1001001, 1002001, 1010101, 1011101, 1012101, 1100011, 1101011, 1102011, 1110111, 1111111, 2000002, 2001002, 10000001, 10011001, 10100101, 10111101, 11000011, 11011011, 11100111, 11111111, 20000002, 100000001, 100010001, 100020001, 100101001, 100111001, 100121001, 101000101, 101010101, 101020101, 101101101, 101111101, 110000011, 110010011, 110020011, 110101011, 110111011, 111000111, 111010111, 111101111, 111111111, 200000002, 200010002, 1000000001, 1000110001, 1001001001, 1001111001, 1010000101, 1010110101, 1011001101, 1011111101, 1100000011, 1100110011, 1101001011, 1101111011, 1110000111, 1110110111, 1111001111};
        for (int n : pals) {
            superPals.add(n);
        }
    }
}
