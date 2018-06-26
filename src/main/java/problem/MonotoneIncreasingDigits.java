package problem;

/**
 * 738. Monotone Increasing Digits
 * <p>
 * Given a non-negative integer N, find the largest number
 * that is less than or equal to N with monotone increasing digits.
 * <p>
 * (Recall that an integer has monotone increasing digits if and only if
 * each pair of adjacent digits x and y satisfy x <= y.)
 */
public class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        char[] arr = (N + "").toCharArray();
        int j = arr.length;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                arr[i - 1]--;
                j = i;
            }
        }

        for (int i = j; i < arr.length; i++) {
            arr[i] = '9';
        }

        return Integer.parseInt(new String(arr));
    }
}
