package problem;

/**
 * 43. Multiply Strings
 * <p>
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also
 * represented as a string.
 * <p>
 * Example 1:
 * <p>
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 * Example 2:
 * <p>
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 * Note:
 * <p>
 * The length of both num1 and num2 is < 110.
 * Both num1 and num2 contain only digits 0-9.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int[] prods = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';
                prods[i + j + 1] += n1 * n2;
            }
        }

        int carry = 0;
        for (int i = prods.length - 1; i >= 0 ; i--) {
            int tmp = (prods[i] + carry) % 10;
            carry = (prods[i] + carry) / 10;
            prods[i] = tmp;
        }

        StringBuilder res = new StringBuilder(carry);
        for(int n : prods) {
            res.append(n);
        }

        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        return res.length() > 0 ? res.toString() : "0";
    }
}
