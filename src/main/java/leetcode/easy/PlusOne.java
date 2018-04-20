package leetcode.easy;

/**
 * 66. Plus One
 * <p>
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return digits;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public int[] plusOne1(int[] digits) {
        if (digits == null || digits.length == 0) return digits;

        int ind = digits.length - 1;
        boolean remained = true;
        while (remained && ind >= 0) {
            int sum = digits[ind] + 1;
            if (sum > 9) {
                remained = true;
                digits[ind] = 0;
            } else {
                digits[ind] = sum;
                remained = false;
            }
            ind--;
        }

        if (remained) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
